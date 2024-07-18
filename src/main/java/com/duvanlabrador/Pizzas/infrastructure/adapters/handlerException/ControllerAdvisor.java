package com.duvanlabrador.Pizzas.infrastructure.adapters.handlerException;

import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception.ElementNotFoundException;
import com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ControllerAdvisor {
    private final ExceptionResponse exceptionResponse;

    public ControllerAdvisor(ExceptionResponse exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<ExceptionResponse> resourceNotComplete(NoDataFoundException ex) {
        exceptionResponse.setDateTime(new Date());
        exceptionResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptionResponse.setTitle("Resource not complete");
        exceptionResponse.setDetail(ex.getMessage());
        exceptionResponse.setDeveloperMessage(ex.getClass().getName());
        return new ResponseEntity<>(exceptionResponse,null,HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ElementNotFoundException.class)
    public ResponseEntity<ExceptionResponse> resourceNotFound(ElementNotFoundException ex) {
        exceptionResponse.setDateTime(new Date());
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND.value());
        exceptionResponse.setTitle("Resource not found");
        exceptionResponse.setDetail(ex.getMessage());
        exceptionResponse.setDeveloperMessage(ex.getClass().getName());
        return new ResponseEntity<>(exceptionResponse,null,HttpStatus.NOT_FOUND);
    }
}
