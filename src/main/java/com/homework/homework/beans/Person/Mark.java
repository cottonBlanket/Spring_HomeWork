package com.homework.homework.beans.Person;

import com.homework.homework.beans.Animal.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Mark {

    @Autowired
    private Cat cat;

    public Mark() {

    }

    public String callCat() {
        return cat.say();
    }

    @PreDestroy
    public void postConstruct() {
        System.out.print("Кто убил Марка?");
    }
}
