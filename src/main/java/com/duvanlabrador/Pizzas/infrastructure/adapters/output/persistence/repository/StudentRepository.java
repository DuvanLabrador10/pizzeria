package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.repository;

import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
