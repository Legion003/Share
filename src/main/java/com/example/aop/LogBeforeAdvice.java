package com.example.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author Legion
 * @Create 2020/11/19 17:14
 * 前置通知
 */
public class LogBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("准备执行方法：" + method.getName() + ",参数列表：" + Arrays.toString(objects));
    }
}
