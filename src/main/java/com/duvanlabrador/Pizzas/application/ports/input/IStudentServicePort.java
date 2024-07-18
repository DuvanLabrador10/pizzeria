package com.duvanlabrador.Pizzas.application.ports.input;

import com.duvanlabrador.Pizzas.domain.model.Student;

import java.util.List;
/**
 *Esta clase es una interfaz(port) que solo conoce del dominio.
 *
 * Ya que application puede acceder a domain.
 **/
public interface IStudentServicePort {

    public List<Student> getAllStudents(int page, int size);

    public Student getStudentFindById(Long studentId);

    public Student createStudent(Student student);

    public Student updateStudent(Long studentId, Student student);

    public Boolean deleteEmployee(Long studentId);




}
