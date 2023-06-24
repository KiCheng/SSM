package com.Lijiacheng;

import com.Lijiacheng.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    void save() {
        bookService.save();
    }

}
