package com.homework.homework.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

@RestController
public class HeadersController {

    @GetMapping("headers")
    public ResponseEntity<Map<String, String>> GetAllHeaders(@RequestHeader Map<String, String> headers) {
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}
