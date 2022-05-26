package com.kwon.validatorplus.constraintvalidators;

import cn.hutool.core.date.DateException;
import cn.hutool.core.date.DateUtil;
import com.kwon.validatorplus.annotation.IDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author Kwon
 */
public abstract class AbstractIPatternValidator<T extends Annotation> implements ConstraintValidator<T, CharSequence> {

    private  String pattern="";



    @Override
    public void initialize(T constraintAnnotation) {
        try {
            pattern=constraintAnnotation.getClass().getField("regexp").toString();
            System.out.println(pattern);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            System.exit(1);
        }


    }

    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext context) {
        if (charSequence != null && charSequence.toString().trim().length() > 0) {
            return Pattern.matches(pattern, charSequence);
        }
        return true;
    }


}
