package com.duvanlabrador.Pizzas.application.service;

import com.duvanlabrador.Pizzas.application.ports.input.StudentServicePort;
import com.duvanlabrador.Pizzas.application.ports.output.StudentPersistencePort;
import com.duvanlabrador.Pizzas.domain.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *Esta clase implementa el INPUT Que es donde se declara la logica.
 **/
@Service
@AllArgsConstructor
public class StudentService implements StudentServicePort {

    private final StudentPersistencePort studentPersistencePort;

    @Override
    public List<Student> getAllStudents(int page, int size) {
        return studentPersistencePort.findAllStudents(page,size);
    }

    @Override
    public Student getStudentFindById(Long studentId) {
        return studentPersistencePort.findStudentById(studentId);
    }

    @Override
    public Student createStudent(Student student) {
        return studentPersistencePort.createStudent(student);
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        return studentPersistencePort.updateStudent(studentId, student);
    }

    @Override
    public Boolean deleteEmployee(Long studentId) {
        return studentPersistencePort.deleteStudentById(studentId);
    }
}
