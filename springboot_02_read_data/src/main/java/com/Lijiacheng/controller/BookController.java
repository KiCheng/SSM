package com.Lijiacheng.controller;

import com.Lijiacheng.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private Enterprise enterprise;
    // 根据id查询
    @RequestMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ======> " + id);
        System.out.println(enterprise);
        return "hello, springboot 3.1.1";
    }
}
