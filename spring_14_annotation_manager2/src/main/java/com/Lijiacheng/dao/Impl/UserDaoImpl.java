package com.Lijiacheng.dao.Impl;

import com.Lijiacheng.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("user dao save...");
    }

}
