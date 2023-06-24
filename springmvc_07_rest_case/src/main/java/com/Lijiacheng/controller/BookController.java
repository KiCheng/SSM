package com.Lijiacheng.controller;

import com.Lijiacheng.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    // 查询全部
    @GetMapping
    public List<Book> getAll(){
        // 不与数据库进行交互，这里使用假数据
        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setName("C# primer");
        book1.setType("编程图书");
        book1.setDescription("C语言入门图书");
        bookList.add(book1);
        Book book2 = new Book();
        book2.setName("计算机网络：自顶向下");
        book2.setType("计算机网络");
        book2.setDescription("计算机四大件之计算机网络");
        bookList.add(book2);
        return bookList;
    }

    // 添加
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save =====> " + book);
        return "'module':'Book save successfully...'";
    }
}
