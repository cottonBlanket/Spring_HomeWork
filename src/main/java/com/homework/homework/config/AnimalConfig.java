package com.homework.homework.config;

import com.homework.homework.beans.Animal.Animal;
import com.homework.homework.beans.Animal.Cat;
import com.homework.homework.beans.Animal.Dog;
import com.homework.homework.beans.Animal.Piggy;
import com.homework.homework.beans.Person.Nastya;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnimalConfig {

    @Bean("cat")
    @Scope("prototype")
    public Animal Cat() {
        return new Cat();
    }

    @Bean("dog")
    @Scope("prototype")
    public Animal dog() {
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Piggy piggy() {
        return new Piggy();
    }
}
