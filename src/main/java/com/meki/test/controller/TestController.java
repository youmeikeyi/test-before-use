package com.meki.test.controller;

import com.meki.test.model.User;
import com.meki.test.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.Reader;

/**
 * User: jinchao.xu
 * Date: 14-10-31
 * Time: 上午11:24
 */
@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public void addUser(@RequestParam String username, @RequestParam String password){
        logger.info("addUser: username="+username +", password=" + password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userService.addUser(user);
    }

    public static void main(String[] args) throws IOException {
        String resource = "classpath:conf/mybatis-config.xml";

        Reader reader = Resources.getResourceAsReader(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = sessionFactory.openSession();

        String statement = "userMapper"+".selectUser";

        User user = session.selectOne(statement ,1);

        System.out.println(user);

    }
}
