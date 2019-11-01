package com.psj.starter.common.utils;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----前置消息");
        Object res = methodProxy.invokeSuper(o,objects);
        System.out.println("----后置消息");
        return res;
    }
}
