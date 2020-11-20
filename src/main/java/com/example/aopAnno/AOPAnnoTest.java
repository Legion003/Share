package com.example.aopAnno;

import com.example.iocAnno.IOCAnnoTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Legion
 * @Create 2020/11/20 0:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AOPAnnoTest.class)
@Configuration
@ComponentScan("com.example.aopAnno")
@EnableAspectJAutoProxy
public class AOPAnnoTest {
    @Autowired
    private UserService userService;

    @Test
    public void testAop(){
        userService.createUser("Tom", 10);
        System.out.println(userService.queryUser());
    }
}
