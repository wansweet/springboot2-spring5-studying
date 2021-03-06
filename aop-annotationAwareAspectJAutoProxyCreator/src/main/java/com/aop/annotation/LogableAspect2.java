package com.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogableAspect2 {

    @Pointcut("@annotation(com.aop.annotation.Logable2)")
    public void aspect() {
    }

    @Around("aspect()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {

        System.out.println("doAround before...Logable2");

        Object returnValue =  point.proceed(point.getArgs());

        System.out.println("doAround after...Logable2");
        return returnValue;
    }
}
