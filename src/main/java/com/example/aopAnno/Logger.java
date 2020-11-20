package com.example.aopAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author Legion
 * @Create 2020/11/20 0:05
 * 切面类
 */
@Component("logger")
@Aspect
public class Logger {
    /**
     * 设置切入点
     */
    @Pointcut("execution(* com.example.aopAnno.UserServiceImpl.*(..))")
    private void pt1(){}

    /**
     * 前置通知
     */
    @Before("pt1()")
    public void beforePrintLog(){
        System.out.println("beforePrintLog记录");
    }

    /**
     * 后置通知
     */
    @After("pt1()")
    public void afterPrintLog(){
        System.out.println("afterPrintLog记录");
    }
}
