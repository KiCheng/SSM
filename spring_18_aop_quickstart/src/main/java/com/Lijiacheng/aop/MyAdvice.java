package com.Lijiacheng.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.Lijiacheng.dao.BookDao.*())")
    private void fn(){}

    // 将共性抽取出来形成的方法
    @Before("fn()")
    public void method(){
        Long startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println("Book dao...");
        }
        Long endTime = System.currentTimeMillis();
        Long spendTime = endTime - startTime;
        System.out.println("执行万次消耗时间:" + spendTime + "ms");
    }

}
