package com.homework.homework.controllers;

import com.homework.homework.annotation.ApiMi;
import com.homework.homework.controllers.dto.request.CreateMiRequest;
import com.homework.homework.controllers.dto.response.IoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@ApiMi
public class MiController {

    @PostMapping("createMi")
    public ResponseEntity<IoResponse> CreateMi(@RequestBody @Valid CreateMiRequest model) {
        IoResponse response = new IoResponse(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
