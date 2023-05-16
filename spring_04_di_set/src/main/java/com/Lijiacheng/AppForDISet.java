package com.Lijiacheng;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
