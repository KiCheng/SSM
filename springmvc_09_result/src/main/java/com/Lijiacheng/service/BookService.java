package com.Lijiacheng.service;

import com.Lijiacheng.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 新增
     * */
    public boolean save(Book book);

    /**
     * 按照id删除
     * */
    public boolean delete(Integer id);

    /**
     * 修改
     * */
    public boolean update(Book book);

    /**
     * 按照id查询
     * */
    public Book getById(Integer id);

    /**
     * 查询全部
     * */
    public List<Book> getAll();
}
