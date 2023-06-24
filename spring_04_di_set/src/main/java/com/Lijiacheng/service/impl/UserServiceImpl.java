package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.BookDao;
import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;

public class UserServiceImpl implements UserService{

    // 5、删除业务层中通过new方式创建的dao对象
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;
    private BookDao bookDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("user service save...");
        userDao.save();
        bookDao.save();
    }

}
