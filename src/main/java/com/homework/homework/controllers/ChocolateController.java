package com.homework.homework.controllers;

import com.homework.homework.managers.ChocolateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ChocolateController {

    ChocolateService chocolateService;

    @GetMapping("/kitkat")
    public String getKitKat() {
        return chocolateService.kitKat();
    }

    @GetMapping("/twix")
    public String getTwix() {
        return chocolateService.twix();
    }

    @GetMapping("/snickers")
    public String getSnickers() {
        return chocolateService.snickers();
    }
}
