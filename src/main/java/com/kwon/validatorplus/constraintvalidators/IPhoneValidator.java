package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;
import com.kwon.validatorplus.annotation.IPhone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String Type Date Validator
 *
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IPhoneValidator implements ConstraintValidator<IPhone, CharSequence> {

    private  String pattern="";

    @Override
    public void initialize(IPhone constraintAnnotation) {
        pattern= constraintAnnotation.regexp();
    }

    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext context) {
        if (charSequence != null && charSequence.toString().trim().length() > 0) {
            return Pattern.matches(pattern, charSequence);
        }
        return true;
    }
}


