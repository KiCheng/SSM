package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("userDao1")
public class UserDaoImpl implements UserDao {
    @Value("${name}")
    private String name;
    public void save(){
        System.out.println("user dao save..." + name);
    }
}
