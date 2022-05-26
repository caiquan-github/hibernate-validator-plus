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

    private Date value;
    private Date max;
    private Date min;
    private String format;



    @Override
    public void initialize(IDate constraintAnnotation) {
        format=constraintAnnotation.format();
        max=stringToDate(constraintAnnotation.max());
        min=stringToDate(constraintAnnotation.min());
    }

    public Date stringToDate(String str){
        try {
            Date result=null;
            if (str != null && str.trim().length() > 0) {
                if (format != null && format.trim().length() > 0){
                    result= DateUtil.parse(str,format);
                }else {
                    result = DateUtil.parse(str);
                }
            }
            return result;
        }catch (DateException e){
            e.printStackTrace();
            throw new RuntimeException("String to Date format error ");
        }

    }

    public boolean isValid() {
        if (getMax()!=null && value!=null && value.compareTo(getMax())==1){
            return false;
        }
        if (getMin()!=null && value!=null && value.compareTo(getMin())==-1){
            return false;
        }
        return true;
    }

    public Date getMax() {
        return max;
    }

    public void setMax(Date max) {
        this.max = max;
    }

    public Date getMin() {
        return min;
    }

    public void setMin(Date min) {
        this.min = min;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }


}
