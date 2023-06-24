package com.Lijiacheng.dao.impl;

import com.Lijiacheng.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id: " + id);

        int x = 1/0;

        return "lijiacheng";
    }
}
