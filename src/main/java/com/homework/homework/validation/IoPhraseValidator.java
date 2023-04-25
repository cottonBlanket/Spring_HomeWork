package com.homework.homework.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IoPhraseValidator implements ConstraintValidator<IoPhraseConstraint, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() <= 20 && value.length() >= 1;
    }
}