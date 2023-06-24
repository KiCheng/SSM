package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.service.ResourcesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAOP6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
        boolean stage = resourcesService.openURL("http://pan.baidu.com/haha", "root   ");
        System.out.println(stage);
    }
}