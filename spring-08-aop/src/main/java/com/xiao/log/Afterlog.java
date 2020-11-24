package com.xiao.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Afterlog implements AfterReturningAdvice {
    //target：执行的类对象
    //returnValue:方法的返回值
    //args:执行的方法的参数
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【Info】执行了"+target.getClass().getSimpleName()+"的"+method.getName()+"方法"+"返回值为"+returnValue);
        for (Object arg : args) {
            System.out.println(arg);
        }
    }
}
