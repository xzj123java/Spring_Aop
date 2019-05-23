package com.jbkTest;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //纯洁的业务类
        Person per= new Person();
        per.setName("谢志剑");
        //创建经纪人
        Helper helper = new Helper(per);
        //产生代理的实例 类加载器（帮谁） 这个类实现实现的接口  经纪人实现的接口
        //jdk动态代理生效返回一个接口 调用接口看结果
         Task task= (Task) Proxy.newProxyInstance(Person.class.getClassLoader(),per.getClass().getInterfaces(),helper);
         task.doSomeThing();


    }
}
