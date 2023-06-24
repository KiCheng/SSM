package com.Lijiacheng.dao;

import com.Lijiacheng.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into tbl_user (name, age) values(#{name}, #{age}))")
    public void save(User user);
}
