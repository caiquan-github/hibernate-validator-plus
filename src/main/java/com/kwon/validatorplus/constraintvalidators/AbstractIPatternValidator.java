package com.kwon.validatorplus.constraintvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

/**
 * @author Kwon
 */
public abstract class AbstractIPatternValidator<T extends Annotation> implements ConstraintValidator<T, CharSequence> {

    private  String regexp ="";



    @Override
    public void initialize(T constraintAnnotation) {
        try {
            regexp =constraintAnnotation.getClass().getField("regexp").toString();
            System.out.println(regexp);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            System.exit(1);
        }


    }

    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext context) {
        if (charSequence != null && charSequence.toString().trim().length() > 0) {
            return Pattern.matches(regexp, charSequence);
        }
        return true;
    }


}
