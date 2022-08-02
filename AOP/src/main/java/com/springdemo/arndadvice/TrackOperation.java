package com.springdemo.arndadvice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
 
@Aspect
public class TrackOperation {
    @Pointcut("execution(* Operation.*(..))")  
    public void abcpointcut(){}//pointcut name  

    @Around("abcPointcut()")//applying pointcut on after advice  
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable//it is advice (after advice)  
    {  
        System.out.println(" Additional Concern Before calling actual method");  
        //System.out.println("Method Signature: "  + jp.getSignature()); 
        Object obj = pjp.proceed();
        System.out.println("Additional Concern After calling actual method");
        return obj;
    }  
}