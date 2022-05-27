package com.kwon.validatorplus.constraintvalidators;

import cn.hutool.core.date.DateException;
import cn.hutool.core.date.DateUtil;
import com.kwon.validatorplus.annotation.IDate;

import javax.validation.ConstraintValidator;
import java.util.Date;

/**
 * @author Kwon
 */
public abstract class AbstractIDateValidator<T> implements ConstraintValidator<IDate, T> {





    public Date stringToDate(String str, String format) {
        try {
            Date result = null;
            if (str != null && str.trim().length() > 0) {
                if (format != null && format.trim().length() > 0) {
                    result = DateUtil.parse(str, format);
                } else {
                    result = DateUtil.parse(str);
                }
            }
            return result;
        } catch (DateException e) {
            e.printStackTrace();
            throw new RuntimeException("String to Date format error ");
        }

    }

    public boolean isValid(Date value, String max, String min, String format) {
        if (value == null) {
            return true;
        }

        Date maxDate = stringToDate(max, format);
        Date minDate = stringToDate(min, format);

        if (maxDate != null && value != null && value.compareTo(maxDate) == 1) {
            return false;
        }
        if (minDate != null && value != null && value.compareTo(minDate) == -1) {
            return false;
        }
        return true;
    }


}
