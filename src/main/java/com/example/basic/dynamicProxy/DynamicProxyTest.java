package com.example.basic.dynamicProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author Legion
 * @Create 2020/11/20 14:20
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Search searchProxy = null;
        // 被代理类/目标类
        Search realSearch = new RealSearch();
        // 使用目标类实例化一个自定义的InvocationHandler
        InvocationHandler searchHandler = new MyInvocationHandler<Search>(realSearch);
        // 通过Proxy类的静态方法，传入类加载器和被代理的接口，返回一个代理类的class
        Class<?> searchProxyClass = Proxy.getProxyClass(Search.class.getClassLoader(), Search.class);
        try {
            // 使用代理类的class获取构造器
            Constructor<?> constructor = searchProxyClass.getConstructor(InvocationHandler.class);
            // 将自定义的InvocationHandler作为构造器参数传入，并实例化代理类
            searchProxy = (Search) constructor.newInstance(searchHandler);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (searchProxy != null){
            // 调用方法
            searchProxy.find("haha");
        }
    }
}
