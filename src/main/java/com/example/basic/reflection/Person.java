package com.example.basic.reflection;

/**
 * @Author Legion
 * @Create 2020/11/13 20:34
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void personPrint(String s){
        System.out.println(s);
        System.out.println("名字是: " + this.name);
    }
}
