package com.meki.test;

import com.meki.test.model.User;
import com.meki.test.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * 测试接口
 */
public class UserTest {

    private UserService userService;

    @Before
    public void before() {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/test-web-context.xml"
                , "classpath:conf/spring-mybatis.xml");
        userService = (UserService) context.getBean("userService");
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("username");
        user.setPassword("123124");
        user.setCreateTime(new Date());
        System.out.println(userService.addUser(user));
    }
}