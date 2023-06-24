package com.Lijiacheng.dao.Impl;


import com.Lijiacheng.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void update() {
        System.out.println("Book dao update is running...");
    }

    public int select(){
        System.out.println("Book dao select is running...");
//        int x = 1/0;
        return 100;
    }


}
