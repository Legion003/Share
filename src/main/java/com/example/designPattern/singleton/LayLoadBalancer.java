package com.example.designPattern.singleton;

/**
 * @Author Legion
 * @Create 2020/11/14 15:06
 * 单例模式，懒汉式（懒加载，延迟加载）
 */
public class LayLoadBalancer {
    // 声明对象，但不实例化
    private volatile static LayLoadBalancer layLoadBalancer;
    // 将构造器设置为私有
    private LayLoadBalancer(){}
    // 获取对象实例，若为第一次获取，则实例化对象
    public static LayLoadBalancer newInstance(){
        if(layLoadBalancer==null){
            // 上锁，以免多个线程同时创建实例
            synchronized (LayLoadBalancer.class){
                // 重新判断是否已经实例化
                if(layLoadBalancer==null){
                    layLoadBalancer = new LayLoadBalancer();
                }
            }
        }
        return layLoadBalancer;
    }
}
