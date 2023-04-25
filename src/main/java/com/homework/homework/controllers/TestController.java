package com.homework.homework.controllers;

import com.homework.homework.config.properties.TestProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestController {
    final TestProperties testProperties;
    @GetMapping("/testConfigInfo")
    public HashMap<String, String> getConfigInfo() {
        HashMap<String, String> profileInfo = new HashMap<>();
        profileInfo.put("env", testProperties.getEvn());
        profileInfo.put("app", testProperties.getName());
        profileInfo.put("list", testProperties.getList().toString());
        return profileInfo;
    }
}
