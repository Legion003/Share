package com.example.designPattern.abstractFactory.spring;

import com.example.designPattern.abstractFactory.ingredient.Button;

/**
 * @Author Legion
 * @Create 2020/11/14 14:43
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("SpringButton");
    }
}
