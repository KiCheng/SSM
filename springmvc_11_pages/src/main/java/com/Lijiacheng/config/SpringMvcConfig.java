package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.Lijiacheng")  // 为了能够扫描到SpringMvcSupport类
@EnableWebMvc

public class SpringMvcConfig {
}
