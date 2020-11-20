package com.example.designPattern.abstractFactory.summer;

import com.example.designPattern.abstractFactory.ingredient.TextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:46
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("SummerTextField");
    }
}
