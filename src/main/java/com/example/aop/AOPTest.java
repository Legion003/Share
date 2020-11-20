package com.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Legion
 * @Create 2020/11/19 17:39
 */
public class AOPTest {
    public static void main(String[] args) {
        // 启动IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/aop-config.xml");
        // 获取AOP代理的bean
        UserService userService = (UserService) context.getBean("userServiceImpl");

        userService.createUser("Tom", 10);
        userService.queryUser();
    }
}
