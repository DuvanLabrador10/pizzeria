package com.duvanlabrador.Pizzas.application.ports.input;

import com.duvanlabrador.Pizzas.domain.model.Student;

import java.util.List;
/**
 *Esta clase es una interfaz(port) que solo conoce del dominio.
 *
 * Ya que application puede acceder a domain.
 **/
public interface StudentServicePort {

    public List<Student> getAllStudents();

    public Student getStudentFindById(Long studentId);

    public Student saveStudent(Student student);

    public Student updateStudent(Long studentId, Student student);

    public Boolean deleteEmployee(Long studentId);




}