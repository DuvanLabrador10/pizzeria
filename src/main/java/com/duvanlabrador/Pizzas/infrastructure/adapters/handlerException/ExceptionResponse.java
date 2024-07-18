package com.duvanlabrador.Pizzas.infrastructure.adapters.handlerException;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class ExceptionResponse {

    private String title;
    private int status;
    private String detail;
    private Date dateTime;
    private String developerMessage;
}
