package com.example.aopAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Legion
 * @Create 2020/11/19 17:14
 * 业务层实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private User user;
    @Override
    public User createUser(String name, int age) {
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
