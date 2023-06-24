package com.Lijiacheng.dao.Impl;


import com.Lijiacheng.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println(System.currentTimeMillis());
        System.out.println("Book dao save...");
    }

    public void update() {
        System.out.println("Book dao upodate...");
    }

}
