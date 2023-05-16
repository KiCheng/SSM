package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;

public class UserDaoImpl implements UserDao {

    /* 创建一个无参构造方法 */
    public UserDaoImpl() {
//        System.out.println("userDaoImpl Constructor is running...");
    }

    @Override
    public void save() {
        System.out.println("user dao save...");
    }
}
