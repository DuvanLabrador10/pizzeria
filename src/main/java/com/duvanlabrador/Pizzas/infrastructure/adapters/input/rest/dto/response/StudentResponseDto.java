package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentResponseDto {

    @JsonProperty
    private Long studentId;
    @JsonProperty
    private String name;
    @JsonProperty
    private String lastname;
    @JsonProperty
    private Integer age;
    @JsonProperty
    private String address;
}
