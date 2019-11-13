//package com.psj.starter.common.utils;
//
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.util.Arrays;
//
//public class LogHandler implements InvocationHandler {
//    private Object targetObject;
//
//    public Object newProxyInstance(Object targetObject) {
//        this.targetObject = targetObject;
//        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
//                targetObject.getClass().getInterfaces(), this);
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("日志:---->start---->");
//        Arrays.stream(args).forEach(System.out::println);
//        Object ret = null;
//        try{
//            System.out.println("日志:---->start---->");
//            ret= method.invoke(targetObject,args);
//            System.out.println("日志:---->success---->");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("error-->>");
//            throw e;
//        }
//        return ret;
//    }
//}
