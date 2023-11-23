package com.micro.training.msagreement.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {BadWordsImpl.class})

// ANATASYON SADECE BİR BİLGİDİR.
public @interface BadWords {
    //Anatasyonlarda sadece primitive tipler kullanılır.

    String[] value();

    String message() default "{Bu bir anatosyon mesajdır.}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
