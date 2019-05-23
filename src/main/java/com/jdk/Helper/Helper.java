package com.jdk.Helper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

//管理重复率高的代码 实现动态接口
public class Helper implements InvocationHandler {
    //管理对象
    Object object;

    //传那个对象管理谁
    public Helper(Object object) {
        this.object = object;
    }

    //重复率高的代码书写
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //起始时间
        Date start = new Date();
        Object resul = method.invoke(object, args);
        //结束时间
        Date end = new Date();
        //时间差
        Long time = start.getTime()-end.getTime();
        System.out.println(method.getName()+"耗时"+time+"毫秒");
        return resul;
    }
}
