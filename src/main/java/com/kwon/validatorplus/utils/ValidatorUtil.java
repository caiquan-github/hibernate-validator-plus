package com.kwon.validatorplus.utils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Manually Validate Toolbox
 * @author Kwon
 */

public class ValidatorUtil {

    public static Validator validator;

    static {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }

    public static void validate(Object object,Class group){
        //TODO 2022/5/26 11:44 Kwon  validate method returnValue all property   whether update one data
        Set<ConstraintViolation<Object>> set = validator.validate(object,group);
        for (ConstraintViolation constraintViolation : set) {
            throw new RuntimeException(constraintViolation.getMessage());
        }
    }

    public static void validateProperty(Object object,String propertyName,Class group){
        Set<ConstraintViolation<Object>> set = validator.validateProperty(object,propertyName,group);
        for (ConstraintViolation constraintViolation : set) {
            throw new RuntimeException(constraintViolation.getMessage());
        }
    }

}
