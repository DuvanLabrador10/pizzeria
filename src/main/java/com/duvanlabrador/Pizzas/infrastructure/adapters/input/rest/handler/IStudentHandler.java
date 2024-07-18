package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.handler;

import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.request.StudentRequestDto;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.response.StudentResponseDto;

import java.util.List;

public interface IStudentHandler {

    List<StudentResponseDto> getAllStudents(int page, int size);

    StudentResponseDto getStudentById(Long studentId);

    StudentResponseDto createStudent(StudentRequestDto studentRequestDto);

    StudentResponseDto updateStudent(Long studentId, StudentRequestDto studentRequestDto);

    void deleteStudent(Long studentId);

}
