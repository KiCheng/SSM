package com.Lijiacheng;


import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao);
        UserServiceImpl userService = ctx.getBean(UserServiceImpl.class);
        System.out.println(userService);
    }
}
