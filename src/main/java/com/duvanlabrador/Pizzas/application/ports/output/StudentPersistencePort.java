package com.duvanlabrador.Pizzas.application.ports.output;

import com.duvanlabrador.Pizzas.domain.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentPersistencePort {

    List<Student> findAllStudents(int page, int size);

    Student findStudentById(Long studentId);

    Student createStudent(Student student);

    Student updateStudent(Long studentId, Student student);

    Boolean deleteStudentById(Long studentId);



}
