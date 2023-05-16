package com.Lijiacheng;


import com.Lijiacheng.config.SpringConfig;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource dataSource = (DruidDataSource) ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
