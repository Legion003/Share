package com.example.designPattern.abstractFactory.factory;

import com.example.designPattern.abstractFactory.ingredient.Button;
import com.example.designPattern.abstractFactory.ingredient.ControlBox;
import com.example.designPattern.abstractFactory.ingredient.TextField;
import com.example.designPattern.abstractFactory.summer.SummerButton;
import com.example.designPattern.abstractFactory.summer.SummerControlBox;
import com.example.designPattern.abstractFactory.summer.SummerTextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:50
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ControlBox createControlBox() {
        return new SummerControlBox();
    }
}
