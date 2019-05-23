package com.xa.util;

import com.xa.DaoImpl.DaoImpl;
import com.xa.cglib.CglibHelper;

public class test {
    public static void main(String[] args) throws InterruptedException {

        CglibHelper cglibHelper = new CglibHelper();
        DaoImpl dao = (DaoImpl) cglibHelper.getProxy(DaoImpl.class);
        dao.addUser();

    }
}
