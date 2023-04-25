package com.homework.homework.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target({ FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { IoPhraseValidator.class})
@Documented
public @interface IoPhraseConstraint {
    String message() default "Invalid phrase field.The phrase length should be in the range from 1 to 20";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
