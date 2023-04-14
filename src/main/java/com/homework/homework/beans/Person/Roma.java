package com.homework.homework.beans.Person;

import com.homework.homework.beans.Animal.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Roma {

    private Dog dog;

    public Roma() {
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String callDog() {
        return dog.say();
    }
}
