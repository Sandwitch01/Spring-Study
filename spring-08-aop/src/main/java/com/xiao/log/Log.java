package com.xiao.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【Info】执行了"+target.getClass().getSimpleName()+"的"+method.getName()+"方法");
    }
}
