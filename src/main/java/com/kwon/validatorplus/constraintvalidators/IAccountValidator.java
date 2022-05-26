package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;
import com.kwon.validatorplus.annotation.IAccount;
import com.kwon.validatorplus.annotation.IPhone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * String Type Date Validator
 *
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IAccountValidator extends AbstractIPatternValidator<IAccount> {

}


