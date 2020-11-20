package com.example.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Legion
 * @Create 2020/11/19 17:14
 * 业务层实现类
 */
public class UserServiceImpl implements UserService{
    private static User user = null;
    @Override
    public User createUser(String name, int age) {
        user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println("执行createUser");
        return user;
    }

    @Override
    public User queryUser() {
        System.out.println("执行queryUser");
        return user;
    }
}
