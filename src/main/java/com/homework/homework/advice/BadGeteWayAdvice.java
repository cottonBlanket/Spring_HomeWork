package com.homework.homework.advice;

import com.homework.homework.exceptions.BadGatewayException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.springframework.http.ResponseEntity.status;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice(basePackages = "com.homework.homework.controllers")
@RequiredArgsConstructor
public class BadGeteWayAdvice {

    @ExceptionHandler({BadGatewayException.class})
    public ResponseEntity<String> badGateway(Exception e) {

        return status(HttpStatus.BAD_GATEWAY)
                .body(e.getMessage());
    }
}
