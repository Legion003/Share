package com.example.aopAnno;

/**
 * @Author Legion
 * @Create 2020/11/19 17:14
 * 业务层接口
 */
public interface UserService {
    User createUser(String name, int age);
    User queryUser();
}
