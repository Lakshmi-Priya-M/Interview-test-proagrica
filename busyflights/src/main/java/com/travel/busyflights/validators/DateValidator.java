package com.travel.busyflights.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DateValidatorImpl.class})
public @interface DateValidator {
	String message() default "The Return Date should be after the Departure Date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
