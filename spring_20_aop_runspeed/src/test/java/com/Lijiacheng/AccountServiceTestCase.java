package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.domain.Account;
import com.Lijiacheng.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account ac = accountService.findById(2);
    }

    @Test
    public void testFindAll(){
        List<Account> acs = accountService.findAll();
    }
}
