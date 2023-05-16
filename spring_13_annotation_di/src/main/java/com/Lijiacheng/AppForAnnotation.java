package com.Lijiacheng;


import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.save();
    }
}
