package com.Lijiacheng.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    // 定义Bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        // 设置模型类的别名扫描
        ssfb.setTypeAliasesPackage("com.Lijiacheng.domain");
        // 设置数据源
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    // 定义Bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mscf = new MapperScannerConfigurer();
        mscf.setBasePackage("com.Lijiacheng.dao");
        return mscf;
    }
}
