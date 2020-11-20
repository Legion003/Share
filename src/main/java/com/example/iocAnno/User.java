package com.example.iocAnno;


import org.springframework.stereotype.Component;

/**
 * @Author Legion
 * @Create 2020/11/19 17:46
 * 实体类User，在本例子中作为bean类
 */
@Component
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
