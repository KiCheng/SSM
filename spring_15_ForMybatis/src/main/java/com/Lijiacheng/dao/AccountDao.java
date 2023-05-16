package com.Lijiacheng.dao;

import com.Lijiacheng.domain.Account;
import org.apache.ibatis.annotations.Insert;

public interface AccountDao {

    @Insert("insert into tbl_account ")
    void save(Account account);

}
