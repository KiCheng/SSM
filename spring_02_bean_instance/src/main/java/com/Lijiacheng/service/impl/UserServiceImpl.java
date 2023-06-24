package com.Lijiacheng.service.Impl;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;

public class UserServiceImpl implements UserService {

    // 5、删除业务层中通过new方式创建的dao对象
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("user service save...");
        userDao.save();
    }

    // 6、提供对应的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
