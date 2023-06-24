package com.Lijiacheng.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    public void transfer(String in, String out, double money);
}
