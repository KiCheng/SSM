package com.Lijiacheng.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.Lijiacheng.dao.BookDao.findName(..))")
    private void fn(){}

//    @Before("fn()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice...");
    }
//    @After("fn()")
    public void after(){
        System.out.println("after advice...");
    }
//    @Around("fn()")
    public Object around(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = null;
        try {
            ret = pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return ret;
    }
//    @AfterReturning(value = "fn()", returning = "ret")
    public void afterReturning(JoinPoint jp, Object ret){
        ret = "liaoziting";
        System.out.println("afterReturning advice... ---->" + ret);
    }
    @AfterThrowing(value = "fn()", throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing advice... ---->" + t);
    }
}
