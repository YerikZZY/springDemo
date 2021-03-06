package com.example.springdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MyAspect {

    @Before("execution(* *.send*(..))")
    public void doBefore(){
        System.out.println("Hello");
    }

    @Around("@annotation(TimeUsed)")
    public void doAround(ProceedingJoinPoint proceedingJoinPoint){

        long currentN = System.nanoTime();
        try {
           Object returnValue = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println(System.nanoTime() - currentN);
    }
}
