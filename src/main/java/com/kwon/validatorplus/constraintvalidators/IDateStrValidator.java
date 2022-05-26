package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

/**
 * String Type Date Validator
 *
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IDateStrValidator extends AbstractIDateValidator<CharSequence> {


    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext context) {
        Date value;
        if (charSequence == null) {
            value = null;
        } else {
            value = super.stringToDate(charSequence.toString());

        }
        setValue(value);
        return isValid();
    }
}


