package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.Lijiacheng.controller", "com.Lijiacheng.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
