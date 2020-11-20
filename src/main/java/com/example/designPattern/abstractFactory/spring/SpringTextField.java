package com.example.designPattern.abstractFactory.spring;

import com.example.designPattern.abstractFactory.ingredient.TextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:44
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("SpringTextField");
    }
}
