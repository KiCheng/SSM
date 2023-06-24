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
    @Pointcut("execution(void com.Lijiacheng.dao.BookDao.update())")
    private void fn(){}

    // 将共性抽取出来形成的方法
    @Before("fn()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

}
