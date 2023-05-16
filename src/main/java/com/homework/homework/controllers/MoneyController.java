package com.homework.homework.controllers;

import com.homework.homework.annotation.MoneyLimit;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class MoneyController {

    @MoneyLimit
    @GetMapping("/getMoney")
    public ResponseEntity<String> getMoney(){
        return new ResponseEntity<>("money", HttpStatus.OK);
    }
}
