package com.Lijiacheng.config;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.Lijiacheng")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
// 开启注释式事务驱动
@EnableTransactionManagement
public class SpringConfig {
}
