package com.duvanlabrador.Pizzas.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 *Esta clase es un POJO con info.
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long studentId;
    private String name;
    private String lastname;
    private Integer age;
    private String address;

}







