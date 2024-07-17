package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.adapter;

import com.duvanlabrador.Pizzas.application.ports.output.StudentPersistencePort;
import com.duvanlabrador.Pizzas.domain.model.Student;

import java.util.List;

public class StudentPersistenceAdapter implements StudentPersistencePort {


    @Override
    public List<Student> findAllStudents(int page, int size) {
        return List.of();
    }

    @Override
    public Student findStudentById(Long studentId) {
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
    public Boolean deleteStudentById(Long studentId) {
        return null;
    }
}
