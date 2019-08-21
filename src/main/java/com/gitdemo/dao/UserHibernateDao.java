package com.gitdemo.dao;

public class UserHibernateDao implements UserDao {

	@Override
	public void save() {
		System.out.println("UserDao Hibernate save!");
	}

	@Override
	public void update() {
		System.out.println("UserDao Hibernate update!");
	}

	@Override
	public void delete() {
		System.out.println("UserDao Hibernate delete!");
	}

	@Override
	public void query() {
		System.out.println("UserDao Hibernate query!");
	}

}
