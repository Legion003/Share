package com.example.designPattern.singleton;

/**
 * @Author Legion
 * @Create 2020/11/14 15:02
 * 单例模式，饿汉式（立即加载）
 */
public class EagerLoadBalancer {
    // 在类加载阶段就创建对象，设置为私有对象
    private static EagerLoadBalancer eagerLoadBalancer = new EagerLoadBalancer();
    // 将构造器设定为私有，其他类无法构造新的对象
    private EagerLoadBalancer(){}
    // 返回对象
    public static EagerLoadBalancer newInstance(){
        return eagerLoadBalancer;
    }
}
