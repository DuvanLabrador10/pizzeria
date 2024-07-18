package com.duvanlabrador.Pizzas.infrastructure.adapters.output.persistence.exception;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException(String message){
        super(message);
    }
}
