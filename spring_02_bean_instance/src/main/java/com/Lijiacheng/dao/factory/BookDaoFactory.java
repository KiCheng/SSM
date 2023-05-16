package com.Lijiacheng.dao.factory;

import com.Lijiacheng.dao.BookDao;
import com.Lijiacheng.dao.Impl.BookDaoImpl;
/**
 * 这里的工厂类提供的方法不是静态方法
 * */
public class BookDaoFactory {
    public BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
