package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAOP5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(100, "hfut");
        System.out.println(name);
    }
}