package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@ComponentScan("com.Lijiacheng.controller")
@ComponentScan("com.Lijiacheng")  // 为了扫描到SpringMvcSupport配置类
@EnableWebMvc  // 开启json数据类型自动转换
public class SpringMvcConfig {
}
