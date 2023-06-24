package com.Lijiacheng.service;

import com.Lijiacheng.domain.Account;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AccountService {
    public void transfer(String in, String out, double money);
}
