package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;

public class UserDaoImpl implements UserDao {

    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init...");
    }
    //表示bean销毁前对应的操作
    public void destroy(){
        System.out.println("destroy...");
    }
    @Override
    public void save() {
        System.out.println("user dao save...");
    }
}
