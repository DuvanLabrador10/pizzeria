package com.duvanlabrador.Pizzas.application.ports.output;

import com.duvanlabrador.Pizzas.domain.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentPersistencePort {

    List<Student> findAllStudents();

    Optional<Student> findStudentById(Long studentId);

    Student save(Student student);

    Boolean deleteStudentById(Long studentId);



}
