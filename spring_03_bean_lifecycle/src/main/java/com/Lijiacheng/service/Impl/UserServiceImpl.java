package com.Lijiacheng.service.Impl;

import com.Lijiacheng.dao.UserDao;
import com.Lijiacheng.service.UserService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean, DisposableBean {

    // 5、删除业务层中通过new方式创建的dao对象
//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("user service save...");
        userDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
