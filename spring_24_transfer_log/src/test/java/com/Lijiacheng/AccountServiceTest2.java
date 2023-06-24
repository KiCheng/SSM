package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest2 {
    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer("Tom","Jerry",50D);
    }

}
