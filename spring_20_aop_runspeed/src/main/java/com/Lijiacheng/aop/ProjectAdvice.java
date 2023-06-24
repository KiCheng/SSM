package com.Lijiacheng.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    // 配置业务层的所有方法
    @Pointcut("execution(* com.Lijiacheng.service.*Service.*(..))")
    private void servicePt(){}

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        // 获取执行签名信息
        Signature signature = pjp.getSignature();
        // 通过签名获取执行操作名称(接口名)
        String className = signature.getDeclaringTypeName();
        // 通过签名获取执行操作名称(方法名)
        String methodName = signature.getName();
        Long startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            pjp.proceed();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("万次执行时间为: " + className + "." + methodName + "----->" + (endTime-startTime) + " ms");
    }
}
