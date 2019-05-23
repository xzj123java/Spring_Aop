package com.jdk.jdkTest;



import com.jdk.DaoImpl.DaoImpl;
import com.jdk.Helper.Helper;
import com.xa.Dao.UserDao;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //创建纯洁的业务类，此时没有被代理
        DaoImpl dao = new DaoImpl();
        //创建代理
        Helper helper = new Helper(dao);
        /**
         * 反射实现代理
         * 加载类对象
         * 获得这个类的接口
         * 经纪人实现的接口
         * 返回接口
         */

        UserDao dao1 = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(),dao.getClass().getInterfaces(),helper);
        dao1.addUser();
    }

}
