package com.Lijiacheng;

import com.Lijiacheng.config.SpringConfig;
import com.Lijiacheng.domain.Account;
import com.Lijiacheng.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class AppForMybatis2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        ArrayList<Account> accounts = accountService.findAll();
        System.out.println(accounts);

    }
}
