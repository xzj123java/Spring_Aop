package com.xa.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

public class CglibHelper implements MethodInterceptor {

    public Object getProxy(Class<?> clzss) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clzss);
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //记录开始时间
        Date start = new Date();
        //调用方法
        Object obj =methodProxy.invokeSuper(o,objects);
        //记录结束时间
        Date end = new Date();
        //总共耗时
        Long time=end.getTime()- start.getTime();
        //调用时输出谁
        System.out.println(method.getName()+"耗时"+time+"毫秒");
        return obj;

    }
}
