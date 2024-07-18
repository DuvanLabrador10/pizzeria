package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception;

public class NoDataFoundException extends RuntimeException{

    public NoDataFoundException(String message){
        super(message);
    }
}
