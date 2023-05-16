package com.Lijiacheng.dao.factory;

import com.Lijiacheng.dao.Impl.OrderDaoImpl;
import com.Lijiacheng.dao.OrderDao;

/**
 * 静态工厂创建对象
 * */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
