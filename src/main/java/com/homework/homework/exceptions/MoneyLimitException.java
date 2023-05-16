package com.homework.homework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MoneyLimitException extends RuntimeException{
    public MoneyLimitException(String ex){
        super(ex);
    }
}
