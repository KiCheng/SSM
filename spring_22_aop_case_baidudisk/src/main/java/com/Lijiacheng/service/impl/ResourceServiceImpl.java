package com.Lijiacheng.service.impl;

import com.Lijiacheng.dao.ResourcesDao;
import com.Lijiacheng.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;
    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
