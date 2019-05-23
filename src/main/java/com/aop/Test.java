package com.aop;

import com.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-ioc.xml");
        UserService userService=context.getBean(UserService.class);
        userService.addUser();
    }
}
