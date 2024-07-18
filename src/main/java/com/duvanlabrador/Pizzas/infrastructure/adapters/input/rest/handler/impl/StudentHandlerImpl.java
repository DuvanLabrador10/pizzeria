package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.handler.impl;

import com.duvanlabrador.Pizzas.application.ports.output.IStudentPersistencePort;
import com.duvanlabrador.Pizzas.domain.model.Student;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.request.StudentRequestDto;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.response.StudentResponseDto;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.handler.IStudentHandler;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.mapper.request.IStudentRequestMapper;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.mapper.response.IStudentResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentHandlerImpl implements IStudentHandler {

    private final IStudentPersistencePort persistencePort;
    private final IStudentRequestMapper studentRequestMapper;
    private final IStudentResponseMapper studentResponseMapper;


    @Override
    public List<StudentResponseDto> getAllStudents(int page, int size) {
        List<Student> students = this.persistencePort.findAllStudents(page, size);
        return this.studentResponseMapper.toResponseList(students);
    }

    @Override
    public StudentResponseDto getStudentById(Long studentId) {
        Student student = this.persistencePort.findStudentById(studentId);
        return this.studentResponseMapper.toResponse(student);
    }

    @Override
    public StudentResponseDto createStudent(StudentRequestDto studentRequestDto) {
        Student student = this.studentRequestMapper.toStudent(studentRequestDto);
        Student studentSaved = this.persistencePort.createStudent(student);
        return this.studentResponseMapper.toResponse(studentSaved);
    }

    @Override
    public  StudentResponseDto updateStudent(Long studentId, StudentRequestDto studentRequestDto) {
        Student student = persistencePort.findStudentById(studentId);

        student.setName(studentRequestDto.getName());
        student.setLastname(studentRequestDto.getLastname());
        student.setAge(studentRequestDto.getAge());
        student.setAddress(studentRequestDto.getAddress());
        Student updatedStudent = persistencePort.createStudent(student);
        return studentResponseMapper.toResponse(updatedStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        this.persistencePort.deleteStudentById(studentId);
    }


}
