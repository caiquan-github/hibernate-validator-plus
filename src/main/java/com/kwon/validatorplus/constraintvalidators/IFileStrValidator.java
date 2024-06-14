package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Date Type Date Validator
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IFileStrValidator extends AbstractIFileValidator<String>{



    @Override
    public boolean isValid(String fileName, ConstraintValidatorContext constraintValidatorContext) {
        return super.validFileNameSuffix(fileName);
    }


}
