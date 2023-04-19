package com.homework.homework.beans.Person;

import com.homework.homework.beans.Animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Mark {

    @Autowired
    @Qualifier("cat")
    private Animal cat;

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
