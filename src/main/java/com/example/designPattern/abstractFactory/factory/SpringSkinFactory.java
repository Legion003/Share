package com.example.designPattern.abstractFactory.factory;

import com.example.designPattern.abstractFactory.ingredient.Button;
import com.example.designPattern.abstractFactory.ingredient.ControlBox;
import com.example.designPattern.abstractFactory.ingredient.TextField;
import com.example.designPattern.abstractFactory.spring.SpringButton;
import com.example.designPattern.abstractFactory.spring.SpringControlBox;
import com.example.designPattern.abstractFactory.spring.SpringTextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:49
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ControlBox createControlBox() {
        return new SpringControlBox();
    }
}
