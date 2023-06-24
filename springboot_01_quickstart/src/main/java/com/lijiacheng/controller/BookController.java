package com.Lijiacheng.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    // 根据id查询
    @RequestMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ======> " + id);
        return "hello, springboot 3.1.1";
    }
}
