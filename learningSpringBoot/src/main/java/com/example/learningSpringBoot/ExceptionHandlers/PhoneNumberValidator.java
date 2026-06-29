package com.example.learningSpringBoot.ExceptionHandlers;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        final String phoneRegex = "^[6-9]\\d{9}$";

        if (phoneNumber == null || phoneNumber.isBlank()) {
            return false;
        }
        System.out.println(phoneNumber + " : " + phoneNumber.matches(phoneRegex));
        return phoneNumber.matches(phoneRegex);
    }
}
