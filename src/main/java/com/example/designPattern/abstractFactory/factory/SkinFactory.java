package com.example.designPattern.abstractFactory.factory;

import com.example.designPattern.abstractFactory.ingredient.Button;
import com.example.designPattern.abstractFactory.ingredient.ControlBox;
import com.example.designPattern.abstractFactory.ingredient.TextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:48
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ControlBox createControlBox();
}
