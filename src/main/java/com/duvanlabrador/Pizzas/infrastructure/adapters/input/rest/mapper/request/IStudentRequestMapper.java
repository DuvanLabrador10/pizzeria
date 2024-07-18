package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.mapper.request;

import com.duvanlabrador.Pizzas.domain.model.Student;
import com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.request.StudentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IStudentRequestMapper {

    Student toStudent(StudentRequestDto studentRequestDto);

}
