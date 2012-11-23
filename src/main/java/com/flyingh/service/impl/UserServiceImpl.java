package com.flyingh.service.impl;

import com.flyingh.dao.UserDao;
import com.flyingh.service.UserService;
import com.flyingh.vo.User;

public class UserServiceImpl implements UserService {
	private UserDao dao;

	public void register(User user) {
		dao.addUser(user);
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
