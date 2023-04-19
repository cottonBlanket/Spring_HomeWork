package com.homework.homework.beans.Person;

import com.homework.homework.beans.Animal.Animal;
import com.homework.homework.beans.Animal.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Roma {

    @Qualifier("dog")
    private Animal dog;

    public Roma() {
    }

    @Autowired
    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public String callDog() {
        return dog.say();
    }
}
