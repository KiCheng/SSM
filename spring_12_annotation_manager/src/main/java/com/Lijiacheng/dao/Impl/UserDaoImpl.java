package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Repository
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("user dao save...");
    }
    @PostConstruct
    public void init(){
        System.out.println("init...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
