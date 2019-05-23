package com.aop.service.impl;

import com.aop.dao.UserDao;
import com.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    //dao层和service建立关系 @Autowired，声明自动注入。
    @Autowired
    UserDao userDao;
    public void addUser() {
        userDao.addUser();

    }

    public void updateUser() {
        userDao.updateUser();

    }

    public void deleteUser() {

    }

    public void selectUser() {

    }
}
