package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String databaseName;
    private int connectionNum;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("user dao save..." + databaseName + " , " + connectionNum);
    }
}
