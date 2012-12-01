package com.flyingh.dao.impl;

import org.springframework.stereotype.Repository;

import com.flyingh.dao.UserDao;
import com.flyingh.vo.User;

@Repository("dao")
public class UserDaoImpl implements UserDao {

	public void addUser(User user) {
		System.out.println("UserDaoImpl.addUser()");
	}

}
