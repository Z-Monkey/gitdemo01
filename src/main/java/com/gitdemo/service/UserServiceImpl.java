package com.gitdemo.service;

import com.gitdemo.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	//构造注入
	public UserServiceImpl() {
		super();
		System.out.println("UserService无参构造函数");
	}
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
		System.out.println("UserService有参构造函数");
	}
	//setter注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("UserService通过setter注入");
	}
	
	@Override
	public void save() {
		System.out.println("UserService的save方法");
		userDao.save();
	}

	@Override
	public void update() {
		System.out.println("UserService的update方法");
		userDao.update();
	}

	@Override
	public void delete() {
		System.out.println("UserService的delete方法");
		userDao.delete();
	}

	@Override
	public void query() {
		System.out.println("UserService的query方法");
		userDao.query();
	}

}
