package com.homework.homework.controllers.dto.request;

import com.homework.homework.validation.AgeConstraint;
import com.homework.homework.validation.IoPhraseConstraint;
import com.homework.homework.validation.NameConstraint;
import lombok.Value;

@Value
public class CreateMiRequest {

    @NameConstraint
    String name;

    @AgeConstraint
    int age;

    @IoPhraseConstraint
    String phrase;

    public String getPhrase() {
        return phrase;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
