package com.homework.homework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
public class BadGatewayException extends RuntimeException{
    public BadGatewayException() {
        super();
    }

    public BadGatewayException(String message) {
        super(message);
    }

}
