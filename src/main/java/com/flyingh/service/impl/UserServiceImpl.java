package com.flyingh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flyingh.dao.UserDao;
import com.flyingh.service.UserService;
import com.flyingh.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
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
