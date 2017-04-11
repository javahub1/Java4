package com.ddb.javacore.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
//@Inherited
public @interface HelloWorld {
	public String value() default "ZhangSan";
}
