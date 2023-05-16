package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;
import org.springframework.stereotype.Component;


@Component("userDao2")
public class UserDaoImpl2 implements UserDao {
    public void save(){
        System.out.println("user dao save...2");
    }
}
