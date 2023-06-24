package com.Lijiacheng.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.Lijiacheng.dao.BookDao.update())")
    public void pt(){}
    @Pointcut("execution(int com.Lijiacheng.dao.BookDao.select())")
    public void pt2(){}

    //@Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }
    //@After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

//    @Around("pt2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice...");
        // 对原始操作进行调用
        Object ret = pjp.proceed();
        System.out.println("around after advice...");
        return ret;
    }

//    @AfterReturning("pt2()")
    public void afterReturning(){
        System.out.println("afterReturning advice...");
    }
    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice...");
    }

}
