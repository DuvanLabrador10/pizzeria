package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.adapter;

import com.duvanlabrador.Pizzas.application.ports.output.IStudentPersistencePort;
import com.duvanlabrador.Pizzas.domain.model.Student;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.entity.StudentEntity;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception.ElementNotFoundException;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception.NoDataFoundException;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.mapper.IStudentEntityMapper;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.repository.IStudentRepository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
/**
 * Esta clase implementa el OUTPUT e inyecta las dependencias de repositorio y mapper.
 * Repository acceso a capa de datos y mapper transformacion de dominio a entidad y
 * entidad a dominio.
 **/
@Service
public class StudentPersistenceAdapter implements IStudentPersistencePort {

    private final IStudentRepository studentRepository;
    private final IStudentEntityMapper studentEntityMapper;

    public StudentPersistenceAdapter(IStudentRepository studentRepository,
                                     IStudentEntityMapper studentEntityMapper) {
        this.studentRepository = studentRepository;
        this.studentEntityMapper = studentEntityMapper;
    }

    @Override
    public List<Student> findAllStudents(int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        List<StudentEntity> students = this.studentRepository.findAll(pageable).getContent();
        if (students.isEmpty()) {
            throw new NoDataFoundException("Data not found");
        }
        return this.studentEntityMapper.toStudentList(students);
    }

    @Override
    public Student findStudentById(Long studentId) {
        verifyStudent(studentId);
        StudentEntity studentEntity = this.studentRepository.findById(studentId).get();
        return this.studentEntityMapper.toStudent(studentEntity);
    }

    @Override
    public Student createStudent(Student student) {
        StudentEntity studentEntity = this.studentEntityMapper.toEntity(student);
        StudentEntity studentRepo = this.studentRepository.save(studentEntity);
        return this.studentEntityMapper.toStudent(studentRepo);
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        verifyStudent(studentId);
        Optional<StudentEntity> studentEntity = this.studentRepository.findById(studentId);
        studentEntity.get().setName(student.getName());
        studentEntity.get().setLastname(student.getLastname());
        studentEntity.get().setAge(student.getAge());
        studentEntity.get().setAddress(student.getAddress());
        return this.studentEntityMapper.toStudent(studentEntity.get());
    }

    @Override
    public Boolean deleteStudentById(Long studentId) {
        verifyStudent(studentId);
        Optional<StudentEntity> studentEntityOptional = this.studentRepository.findById(studentId);

        if (studentEntityOptional.isPresent()) {
            StudentEntity studentEntity = studentEntityOptional.get();
            this.studentRepository.delete(studentEntity);
            return true;
        } else {
            return false;
        }
    }


    private void verifyStudent(Long studentId){
        Optional<StudentEntity> optionalStudentEntity = this.studentRepository.findById(studentId);
        if (optionalStudentEntity.isEmpty()){
            throw new ElementNotFoundException("The student whit id " + studentId + " don't exist!");
        }
    }
}
