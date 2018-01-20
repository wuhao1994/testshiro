package com.example.demo;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.dao.UserTestDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroProjectApplicationTests {

	@Resource
	private UserTestDao userTestao;
	@Test
	public void contextLoads() {
		UserTest user = userTestao.findByUsername("123");
		System.out.println("123");
	}

}
