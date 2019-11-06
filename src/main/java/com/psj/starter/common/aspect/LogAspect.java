package com.psj.starter.common.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.psj.starter.bean.ResultBean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.xml.transform.Result;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: jluzh-psj-starter
 * @description: 日志管理AOP类
 * @author: DemonsPan
 * @create: 2019-11-06 18:20
 **/
@Aspect
@Component
@Slf4j
public class LogAspect {
    @Pointcut("execution(public * com.psj.starter.controller.*.*(..))")
    public void webLog() {
    }

    @Around("webLog()")
    public Object arround(ProceedingJoinPoint pjp) {
        try {
            log.info("log方法前");
            Object o = pjp.proceed();
            log.info("log方法后--结果是" + o);
            return o;
        } catch (Throwable e) {
            log.error(pjp.getSignature() + "出现异常:  ", e);
            return null;
        }
    }

}
