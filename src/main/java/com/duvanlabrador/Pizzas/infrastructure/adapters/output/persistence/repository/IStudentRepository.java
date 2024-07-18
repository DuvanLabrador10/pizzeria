package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.repository;

import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {
}
