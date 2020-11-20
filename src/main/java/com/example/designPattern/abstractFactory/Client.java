package com.example.designPattern.abstractFactory;

import com.example.designPattern.abstractFactory.factory.SkinFactory;
import com.example.designPattern.abstractFactory.factory.SpringSkinFactory;
import com.example.designPattern.abstractFactory.ingredient.Button;
import com.example.designPattern.abstractFactory.ingredient.ControlBox;
import com.example.designPattern.abstractFactory.ingredient.TextField;

/**
 * @Author Legion
 * @Create 2020/11/14 14:51
 */
public abstract class Client implements SkinFactory {
    public static void main(String[] args) {
        // 获取特定的工厂
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean();
        // 获取特定的组件
        Button button = skinFactory.createButton();
        ControlBox controlBox = skinFactory.createControlBox();
        TextField textField = skinFactory.createTextField();
        // 调用对应的方法
        button.display();
        controlBox.display();
        textField.display();
    }
}
