package com.example.designPattern.abstractFactory.summer;

import com.example.designPattern.abstractFactory.ingredient.ControlBox;

/**
 * @Author Legion
 * @Create 2020/11/14 14:46
 */
public class SummerControlBox implements ControlBox {
    @Override
    public void display() {
        System.out.println("SummerControlBox");
    }
}
