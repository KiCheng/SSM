package com.Lijiacheng.config;

import com.Lijiacheng.dao.UserDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@PropertySource("jdbc.properties")
public class JdbcConfig {
    @Value("${jdbc.driverName}")
    private String driver;
    @Value("jdbc.url")
    private String url;
    @Value("jdbc.username")
    private String userName;
    @Value("jdbc.password")
    private String password;

    @Bean
    public DataSource dataSource(UserDao userDao){
        System.out.println(userDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
