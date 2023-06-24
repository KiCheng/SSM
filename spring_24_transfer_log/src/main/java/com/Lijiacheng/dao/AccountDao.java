package com.Lijiacheng.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    // 注意数据层方法参数如果有多个，要用 @Param 注释参数
    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    public void inMoney(@Param("name") String name, @Param("money") double money);


    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    public void outMoney(@Param("name") String name, @Param("money") double money);


}
