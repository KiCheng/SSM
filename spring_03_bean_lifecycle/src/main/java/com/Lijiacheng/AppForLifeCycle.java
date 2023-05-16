package com.Lijiacheng;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();

        ctx.close();
    }
}
