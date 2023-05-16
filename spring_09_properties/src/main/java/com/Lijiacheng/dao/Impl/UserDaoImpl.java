package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;



public class UserDaoImpl implements UserDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save(){
        System.out.println("user dao save..." + name);
    }

}
