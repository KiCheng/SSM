package com.Lijiacheng.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PasswordAdvice {
    @Pointcut("execution(boolean com.Lijiacheng.service.ResourcesService.openURL(..))")
    private void fn() {
    }
    @Around("fn()")
    public Object passwordTrim(ProceedingJoinPoint pjp) throws Throwable {
        // 核心业务 1 获取参数并格式处理  2 交还给原始方法
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++){
            // 判断是否为字符串
            if(args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();  // toString()返回对象的字符串形式
            }
        }
        Object ret = pjp.proceed(args);
        return ret;
    }
}
