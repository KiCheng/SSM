package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.LogDao;
import com.Lijiacheng.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public void log(String out,String in,double money){
        logDao.log("转账操作由 " + out + "到" + in + "，金额：" + money);
    }

}
