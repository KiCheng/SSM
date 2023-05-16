package com.Lijiacheng;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 3、创建IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4、获取Bean
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }
}
