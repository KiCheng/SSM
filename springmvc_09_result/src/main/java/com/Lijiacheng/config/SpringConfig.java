package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.Lijiacheng.service"})
@PropertySource("classpath:jdbc.properties")
@Import({MybatisConfig.class, JdbcConfig.class})
// 创建事务管理
@EnableTransactionManagement
public class SpringConfig {
}
