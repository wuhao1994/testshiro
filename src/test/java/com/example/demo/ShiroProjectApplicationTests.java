package com.example.demo;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.dao.UserTestDao;
import com.example.demo.entity.SysRole;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserTest;
import com.example.demo.service.UserInfoService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
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
    @Resource
    private UserInfoService userInfoService;
	@Test
	public void contextLoads() {
		UserInfo user = new UserInfo();
		user.setName("wuhao");
        ByteSource salt = ByteSource.Util.bytes("123");
		String password = "123456";
		String newword = new SimpleHash("MD5",password,salt,1024).toHex();
        user.setSalt(salt.toHex());
		user.setPassword(newword);
		user.setState(new Byte("0"));
        userInfoService.addUserInfo(user);
	}

}
