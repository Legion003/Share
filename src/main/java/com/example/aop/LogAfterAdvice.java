package com.example.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author Legion
 * @Create 2020/11/19 17:15
 * 后置通知
 */
public class LogAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法返回：" + o);
    }
}
