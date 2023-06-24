package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

// 配置注释类
@Configuration
// 包扫描，主要扫描的是项目中的AccountServiceImpl类
@ComponentScan("com.Lijiacheng")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}

