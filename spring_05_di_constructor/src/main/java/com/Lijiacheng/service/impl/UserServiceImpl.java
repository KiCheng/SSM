package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void save() {
        System.out.println("user service save...");
        userDao.save();
    }

}
