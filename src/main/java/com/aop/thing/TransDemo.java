package com.aop.thing;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 相当于代理
 * 前置、后置、环绕、异常抛出。
 */
public class TransDemo {
    public void begin(){
        System.out.println("前置处理");
    }

    public void end(){
        System.out.println("后置处理");
    }
    //不影响
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕处理之前");
        joinPoint.proceed();
        System.out.println("环绕处理之后");
    }

    public void thorwExption() throws Exception {
        throw new Exception("制造一个异常");
    }
}
