package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;
import org.springframework.stereotype.Component;


@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("user dao save...");
    }
}
