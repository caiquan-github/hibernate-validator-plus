package com.kwon.validatorplus.constraintvalidators;


import com.google.auto.service.AutoService;
import com.kwon.validatorplus.annotation.IIpAddress;

import javax.validation.ConstraintValidator;

/**
 *
 * @author Kwon
 */
@AutoService(ConstraintValidator.class)
public class IIpAddressValidator extends AbstractIPatternValidator<IIpAddress> {


}


