package com.kwon.validatorplus.constraintvalidators;

import com.google.auto.service.AutoService;
import com.kwon.validatorplus.annotation.IlicensePlateNumber;

import javax.validation.ConstraintValidator;


@AutoService(ConstraintValidator.class)
public class IlicensePlateNumberValidator extends AbstractIPatternValidator<IlicensePlateNumber> {

}
