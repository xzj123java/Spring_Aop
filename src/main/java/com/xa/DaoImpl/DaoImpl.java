package com.xa.DaoImpl;

import com.xa.Dao.UserDao;

import java.util.Date;

public class DaoImpl implements UserDao {
    public void addUser() {
        System.out.println("删除方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void updateUser() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser() {

    }

    public void selectUser() {

    }
}
