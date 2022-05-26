package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

/**
 * Date Type Date Validator
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IDateValidator  extends AbstractIDateValidator<Date>{



    @Override
    public boolean isValid(Date date, ConstraintValidatorContext context) {
        setValue(date);
        return isValid();
    }
}
