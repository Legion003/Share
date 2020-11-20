package com.example.basic.annotation;


import java.lang.annotation.*;

/**
 * @Author Legion
 * @Create 2020/11/14 14:20
 * 自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    String name() default "lisi";
    int age() default 18;
}
