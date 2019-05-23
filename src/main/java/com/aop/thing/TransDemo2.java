package com.aop.thing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//新建基于注解的切面类
public class TransDemo2 {

    @Pointcut(value = "execution(* com.aop.service.*.*.*(..))")
    public void point() {

    }

    @Before(value = "point()")
    public void begin() {
        System.out.println("前置处理");
    }

    @AfterReturning(value = "point()")
    public void end() {
        System.out.println("后置处理");
    }

    //不影响
    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕处理之前");
        joinPoint.proceed();
        System.out.println("环绕处理之后");
    }

    @AfterReturning("point()")
    public void thorwExption() throws Exception {
        throw new Exception("制造一个异常");
    }
}
