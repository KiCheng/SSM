package com.Lijiacheng;

import com.Lijiacheng.dao.BookDao;
import com.Lijiacheng.dao.OrderDao;
import com.Lijiacheng.dao.factory.BookDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
//        /*
//        * 通过工厂对象获取bean对象
//        * */
//        BookDaoFactory bookDaoFactory = new BookDaoFactory();
//        BookDao bookDao = bookDaoFactory.getBookDao();
//        bookDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
