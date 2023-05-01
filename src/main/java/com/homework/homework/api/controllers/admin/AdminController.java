package com.homework.homework.api.controllers.admin;

import com.homework.homework.api.annotation.AdminApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@AdminApi
public class AdminController {

    @GetMapping("/check")
    public ResponseEntity<String> CheckAdminApi() {
        return new ResponseEntity<>("I'm Admin", HttpStatus.OK);
    }

}
