package com.example.iocAnno;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.lang.annotation.Target;


/**
 * @Author Legion
 * @Create 2020/11/20 0:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = IOCAnnoTest.class)
@Configuration
@ComponentScan("com.example.iocAnno")
public class IOCAnnoTest {
    @Autowired
    private User user;

    @Test
    public void testIoc(){
        user.setName("Tom");
        System.out.println(user.getName());
    }
}
