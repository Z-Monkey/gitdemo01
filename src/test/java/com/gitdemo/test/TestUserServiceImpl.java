package com.gitdemo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gitdemo.domain.User;
import com.gitdemo.service.UserService;

public class TestUserServiceImpl {
	ApplicationContext ac =  new ClassPathXmlApplicationContext("applicationContext-core.xml");
	
	@Test
	public void test02() {
		UserService userService = (UserService) ac.getBean("userService2");
		User user = (User) ac.getBean("user2");
		System.out.println("分支：test----------------------------------------");
		userService.save();
		userService.delete();
		userService.query();
		userService.update();
		System.out.println(user.toString());
		System.out.println("分支：test----------------------------------------");
	}
	
	@Test
	public void test01() {
		UserService userService = (UserService) ac.getBean("userService1");
		User user = (User) ac.getBean("user1");
		System.out.println("分支：test----------------------------------------");
		userService.save();
		userService.delete();
		userService.query();
		userService.update();
		System.out.println(user.toString());
		System.out.println("分支：test----------------------------------------");
	}
}
