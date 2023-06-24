package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.AccountDao;
import com.Lijiacheng.domain.Account;
import com.Lijiacheng.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    public void save(Account account){
        accountDao.add(account);
    }

    public void delete(int id){
        accountDao.delete(id);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public Account findById(Integer id) {
        return accountDao.selectById(id);
    }

    public ArrayList<Account> findAll(){
        return accountDao.selectAll();
    }


}
