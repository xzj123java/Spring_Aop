package com.jdk.Dao;


public interface UserDao {
    public void addUser() throws InterruptedException;

    public void updateUser() throws InterruptedException;

    public void deleteUser();

    public void selectUser();

}