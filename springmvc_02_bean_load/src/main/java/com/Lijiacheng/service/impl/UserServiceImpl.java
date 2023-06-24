package com.Lijiacheng.service.impl;

import com.Lijiacheng.domain.User;
import com.Lijiacheng.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user) {
        System.out.println("User Service...");
    }
}
