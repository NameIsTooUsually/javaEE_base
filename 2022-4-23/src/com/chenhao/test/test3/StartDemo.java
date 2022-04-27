package com.chenhao.test.test3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface StartDemo {
    public String  value() default "run";
}
