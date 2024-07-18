package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.mapper;

import com.duvanlabrador.Pizzas.domain.model.Student;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IStudentEntityMapper {

    //Convertimos un modelo de dominio a entidad

    StudentEntity toEntity(Student student);

    //Convertimos una entidad a un modelo de dominio

    Student toStudent(StudentEntity studentEntity);

    //Convertir una lista de entidades a una lista de modelo
    List<Student> toStudentList(List<StudentEntity> studentList);


}
