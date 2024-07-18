package com.duvanlabrador.Pizzas.infrastructure.adapters.input.rest.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentRequestDto {
    @NotBlank(message = "Field name can't be empty or null")
    private String name;
    @NotBlank(message = "Field lastname can't be empty or null")
    private String lastname;
    @NotBlank(message = "Field age can't be empty or null")
    private Integer age;
    @NotBlank(message = "Field address can't be empty or null")
    private String address;
}
