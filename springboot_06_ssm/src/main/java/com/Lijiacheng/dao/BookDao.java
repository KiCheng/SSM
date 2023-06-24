package com.Lijiacheng.dao;

import com.Lijiacheng.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加 Mapper注释
@Mapper
public interface BookDao {
    @Insert("insert into tbl_book values(null, #{type}, #{name}, #{description})")
    public int save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
