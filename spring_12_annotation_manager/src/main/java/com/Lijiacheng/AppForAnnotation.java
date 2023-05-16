package com.Lijiacheng;


import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.dao.Impl.UserDaoImpl;
import com.Lijiacheng.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao1 = (UserDao) ctx.getBean(UserDaoImpl.class);
        UserDao userDao2 = (UserDao) ctx.getBean(UserDaoImpl.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        ctx.close();
    }
}
