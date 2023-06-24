package com.Lijiacheng.dao.Impl;


import com.Lijiacheng.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        Long startTime = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println("Book dao save...");
        }
        Long endTime = System.currentTimeMillis();
        Long spendTime = endTime - startTime;
        System.out.println("执行万次消耗时间:" + spendTime + "ms");
    }

    public void update() {
        System.out.println("Book dao upodate...");
    }


    public void select() {
        System.out.println("Book dao select...");
    }


    public void delete() {
        System.out.println("Book dao delete...");
    }

}
