package com.Lijiacheng.dao.factory;

import com.Lijiacheng.dao.BookDao;
import com.Lijiacheng.dao.Impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean implements FactoryBean<BookDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public BookDao getObject() throws Exception {
        return new BookDaoImpl();
    }
    //返回所创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }
}
