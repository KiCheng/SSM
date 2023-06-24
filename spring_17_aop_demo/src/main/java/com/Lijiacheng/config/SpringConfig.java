package com.Lijiacheng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.Lijiacheng")  // 默认会扫描该类所在的包下所有的配置类
@EnableAspectJAutoProxy
public class SpringConfig {

}
