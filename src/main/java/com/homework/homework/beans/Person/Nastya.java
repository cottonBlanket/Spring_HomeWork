package com.homework.homework.beans.Person;

import com.homework.homework.beans.Animal.Piggy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Nastya {

    private final Piggy piggy;

    public Nastya(Piggy piggy) {
        this.piggy = piggy;
    }

    public String callPiggy() {
        return piggy.say();
    }
}
