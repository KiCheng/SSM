package com.Lijiacheng.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.Lijiacheng")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
