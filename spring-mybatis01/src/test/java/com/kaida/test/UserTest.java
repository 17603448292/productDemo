package com.kaida.test;

import com.kaida.entity.Role;
import com.kaida.entity.User;
import com.kaida.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void selectUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user1 =new User();
        user1.setUserName("嘻嘻");
        User user2 =new User();
        user2.setUserName("咕咕");
        User user3 =new User();
        user3.setUserName("叽叽");
        User user4 =new User();
        user4.setUserName("嘎嘎");
        List<User> users =new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        userService.addUsers(users);
//        User user = new User();
//        user.setUserName("gaga");
//        userService.addUser(user);
    }
}
