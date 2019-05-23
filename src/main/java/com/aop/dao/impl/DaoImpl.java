package com.aop.dao.impl;

import com.aop.dao.UserDao;
import org.springframework.stereotype.Component;
/**
 * @Component
 * 声明DaoImpl被Spring容器托管
 * 只
 *
 * 如：注入管理 ，生命周期管理
 */

@Component
public class DaoImpl implements UserDao {
    public void addUser() {
        System.out.println("添加用户成功");
    }

    public void updateUser() {
        System.out.println("修改用户成功");
    }

    public void deleteUser() {
        System.out.println("删除用户成功");
    }

    public void selectUser() {
        System.out.println("查看用户成功");
    }
}
