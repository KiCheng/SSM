package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String databaseName;
    private int connectionNum;

    public UserDaoImpl(){
    }

    public UserDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("user dao save..." + databaseName + " , " + connectionNum);
    }
}
