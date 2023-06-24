package com.Lijiacheng.dao;

import com.Lijiacheng.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

public interface AccountDao {
    /* 增删改查 */
    @Insert("insert into tbl_account (name,money) values(#{name},#{money})")
    void add(Account account);

    @Delete("delete from tbl_account where id = #{id}")
    void delete(int id);

    @Update("update tbl_account set name = #{name}, money = #{money} where id = #{id}")
    void update(Account account);

    @Select("select * from tbl_account where id = #{id}")
    Account selectById(int id);

    @Select("select * from tbl_account")
    ArrayList<Account> selectAll();
}
