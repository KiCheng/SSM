package com.Lijiacheng;

import com.Lijiacheng.dao.UserDao;
import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DruidDataSource dataSource = ctx.getBean("dataSource", DruidDataSource.class);
//        System.out.println(dataSource);
        ComboPooledDataSource dataSource = (ComboPooledDataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

    }
}
