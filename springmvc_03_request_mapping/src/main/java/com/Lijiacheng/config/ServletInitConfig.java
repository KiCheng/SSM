package com.Lijiacheng.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // SpringConfig
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // SpringMvcConfig
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    // 访问路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
