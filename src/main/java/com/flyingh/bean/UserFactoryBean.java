package com.flyingh.bean;

import org.springframework.beans.factory.FactoryBean;

import com.flyingh.vo.User;

public class UserFactoryBean implements FactoryBean<User> {

	public User getObject() throws Exception {
		return new User();
	}

	public Class<?> getObjectType() {
		return User.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
