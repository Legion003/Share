package com.example.basic.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Legion
 * @Create 2020/11/20 14:30
 * 自定义的InvocationHandler
 */
public class MyInvocationHandler<T> implements InvocationHandler {
    private T target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志");
        method.invoke(target, args);
        System.out.println("结束");
        return null;
    }
}
