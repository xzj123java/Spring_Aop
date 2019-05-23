package com.jbkTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Helper implements InvocationHandler {
    //帮助的目标对象
    private Object target;

    //传进来帮助谁
    public Helper(Object target) {

        this.target = target;

    }

    /**
     *帮target做事
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是经纪人我给"+target+"预约欧阳娜娜");
        Object result = method.invoke(target,args);
        System.out.println("提醒"+target+"送娜娜回家");
        return result;
    }
}
