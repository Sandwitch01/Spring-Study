package com.xiao.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Diypointcut {
    @Before("execution(* com.xiao.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("===========方法执行前==============");
    }
    @After("execution(* com.xiao.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("===========方法执行后==============");
    }
    @Around("execution(* com.xiao.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("############环绕前############");
        Object proceed = joinPoint.proceed();
        System.out.println("############环绕后############");
    }
}
