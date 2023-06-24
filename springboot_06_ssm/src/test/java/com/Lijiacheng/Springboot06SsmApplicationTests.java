package com.Lijiacheng;

import com.Lijiacheng.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06SsmApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void testGeyById() {
        System.out.println(bookService.getById(2));
    }

    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }

}
