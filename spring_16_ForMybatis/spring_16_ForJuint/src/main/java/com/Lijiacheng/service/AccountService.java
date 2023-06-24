package com.Lijiacheng.service;

import com.Lijiacheng.domain.Account;

import java.util.ArrayList;

public interface AccountService {
    void save(Account account);

    void delete(int id);

    void update(Account account);

    Account findById(Integer id);

    ArrayList<Account> findAll();
}
