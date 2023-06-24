package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.AccountDao;
import com.Lijiacheng.service.AccountService;
import com.Lijiacheng.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@Transactional(rollbackFor = {IOException.class})
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;
    @Override
    public void transfer(String in, String out, double money) {
        try {
            accountDao.outMoney(out, money);
            int x = 1/0;
            accountDao.inMoney(in, money);
        }finally {
            logService.log(out,in,money);
        }
    }
}
