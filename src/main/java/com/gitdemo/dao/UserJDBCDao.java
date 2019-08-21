package com.gitdemo.dao;

public class UserJDBCDao implements UserDao {

	@Override
	public void save() {
		System.out.println("UserDao JDBC save!");
	}

	@Override
	public void update() {
		System.out.println("UserDao JDBC update!");
	}

	@Override
	public void delete() {
		System.out.println("UserDao JDBC delete!");
	}

	@Override
	public void query() {
		System.out.println("UserDao JDBC query!");
	}

}
