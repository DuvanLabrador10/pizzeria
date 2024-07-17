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
        return List.of();
    }

    @Override
    public Student getStudentFindById(Long studentId) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        return null;
    }

    @Override
    public Boolean deleteEmployee(Long studentId) {
        return null;
    }
}
