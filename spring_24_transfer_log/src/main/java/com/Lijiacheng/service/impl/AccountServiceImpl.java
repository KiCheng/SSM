package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.AccountDao;
import com.Lijiacheng.domain.Account;
import com.Lijiacheng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void transfer(String in, String out, double money) {
        accountDao.outMoney(out, money);
        int x = 1/0;  // 模拟异常
        accountDao.inMoney(in, money);
    }
}
