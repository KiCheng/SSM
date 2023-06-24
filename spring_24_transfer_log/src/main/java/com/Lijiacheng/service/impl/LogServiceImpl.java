package com.Lijiacheng.service;

import com.Lijiacheng.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    @Autowired
    private LogDao logDao;
}
