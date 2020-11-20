package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Legion
 * @Create 2020/11/19 17:46
 * bean的使用
 */
public class IOCTest {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/ioc-config.xml");
        // 获取bean
        User user = (User) context.getBean("user");
        // 调用方法
        user.setName("Tom");
        user.setAge(10);
        System.out.println(user.toString());
    }
}
