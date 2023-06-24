package com.Lijiacheng.service.Impl;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao1")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        userDao.save();
    }
}
