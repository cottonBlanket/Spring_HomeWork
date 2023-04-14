package com.homework.homework.controllers;

import com.homework.homework.controllers.dto.request.ProductRequest;
import com.homework.homework.controllers.dto.response.ProductResponse;
import com.homework.homework.exceptions.BadGatewayException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @PostMapping("create")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest model) {
        return new ResponseEntity<>(new ProductResponse(model), HttpStatus.OK);
    }

    @GetMapping("exception")
    public ResponseEntity<String> getBadGateway(@RequestHeader String message) {
        throw new BadGatewayException(message);
    }
}
