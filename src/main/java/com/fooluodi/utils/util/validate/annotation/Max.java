package com.fooluodi.utils.util.validate.annotation;

import java.lang.annotation.*;

/**
 * Created by di on 19/7/2016.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Max {
    int value();
}
