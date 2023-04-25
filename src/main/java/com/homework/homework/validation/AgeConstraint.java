package com.homework.homework.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Min(1)
@Max(100)
public @interface AgeConstraint {
}
