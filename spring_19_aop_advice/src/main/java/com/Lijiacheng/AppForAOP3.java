package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAOP3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.update();
        int num = bookDao.select();
        System.out.println(num);
    }
}