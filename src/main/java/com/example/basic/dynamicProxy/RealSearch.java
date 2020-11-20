package com.example.basic.dynamicProxy;

/**
 * @Author Legion
 * @Create 2020/11/20 14:30
 * 被代理类
 */
public class RealSearch implements Search {

    @Override
    public void find(String key) {
        System.out.println("进行检索:"+key);
    }
}
