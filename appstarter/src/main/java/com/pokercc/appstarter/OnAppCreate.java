package com.pokercc.appstarter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by cisco on 2017/11/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnAppCreate {
    /**
     * start appEntries as this order asc
     *
     * @return orderNumber
     */
    int order() default 0;
}
