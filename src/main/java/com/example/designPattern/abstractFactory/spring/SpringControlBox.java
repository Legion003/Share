package com.example.designPattern.abstractFactory.spring;

import com.example.designPattern.abstractFactory.ingredient.ControlBox;

/**
 * @Author Legion
 * @Create 2020/11/14 14:43
 */
public class SpringControlBox implements ControlBox {
    @Override
    public void display() {
        System.out.println("SpringControlBox");
    }
}
