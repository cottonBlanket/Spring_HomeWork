package com.homework.homework.controller;

import com.homework.homework.managers.FruitService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FruitController {

    FruitService fruitService;

    @GetMapping("/check")
    public void check() {
        fruitService.apple("red");
        fruitService.banana("long");
        fruitService.orange(50);
    }

}
