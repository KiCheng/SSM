package com.lijiacheng;

import com.lijiacheng.dao.UserDao;
import com.lijiacheng.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

	@Autowired
	private UserDao userDao;
	@Test
	void testDao() {
		List<User> users = userDao.selectList(null);
		System.out.println(users);
	}

}
