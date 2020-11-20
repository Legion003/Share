package com.example.basic.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author Legion
 * @Create 2020/11/13 20:34
 * 反射样例
 */
public class ReflectionTest {
    public static void main(String[] args) {
        try {
            // 反射获取类
            Class<?> personClass = Class.forName("com.example.basic.reflection.Person");
            // 反射获取构造器
            Constructor<?> constructor = personClass.getConstructor(String.class);
            // 反射获取方法
            Method personPrint = personClass.getDeclaredMethod("personPrint", String.class);
            // 通过xml文件获取值
            String value = XMLUtil.getValue();
            // 调用方法，第一个参数是实例，通过构造器构造实例
            personPrint.invoke(constructor.newInstance(value), "这是一条打印");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
