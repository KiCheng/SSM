package com.Lijiacheng.dao;

import com.Lijiacheng.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookDao {
    @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description})")
    public void save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public void delete(Integer id);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
