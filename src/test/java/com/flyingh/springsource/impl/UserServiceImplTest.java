package com.flyingh.springsource.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flyingh.service.UserService;
import com.flyingh.vo.User;

public class UserServiceImplTest {
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		userService = new ClassPathXmlApplicationContext("beans.xml").getBean(
				"service", UserService.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegister() {
		userService.register(new User(1, "flyingh", "password"));
	}

}
