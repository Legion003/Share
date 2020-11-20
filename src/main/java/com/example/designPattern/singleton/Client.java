package com.example.designPattern.singleton;

/**
 * @Author Legion
 * @Create 2020/11/14 15:24
 */
public class Client {
    public static void main(String[] args) {
        LayLoadBalancer layLoadBalancer1 = LayLoadBalancer.newInstance();
        LayLoadBalancer layLoadBalancer2 = LayLoadBalancer.newInstance();
        System.out.println(layLoadBalancer1==layLoadBalancer2);
    }
}
