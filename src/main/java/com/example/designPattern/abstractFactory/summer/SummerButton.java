package com.example.designPattern.abstractFactory.summer;

import com.example.designPattern.abstractFactory.ingredient.Button;

/**
 * @Author Legion
 * @Create 2020/11/14 14:46
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("SummerButton");
    }
}
