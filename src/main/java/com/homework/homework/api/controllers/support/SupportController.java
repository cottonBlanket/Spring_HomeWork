package com.homework.homework.api.controllers.support;

import com.homework.homework.api.annotation.SupportApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SupportApi
public class SupportController {

    @GetMapping("check")
    public ResponseEntity<String> checkSupportApi() {
        return new ResponseEntity<>("I'm Support", HttpStatus.OK);
    }
}
