package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.mapper.response;

import com.duvanlabrador.Pizzas.domain.model.Student;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.response.StudentResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IStudentResponseMapper {

    StudentResponseDto toResponse(Student student);

    List<StudentResponseDto> toResponseList(List<Student> studentList);
}
