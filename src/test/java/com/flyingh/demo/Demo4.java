package com.flyingh.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flyingh.service.UserService;
import com.flyingh.vo.Driver;
import com.flyingh.vo.User;

public class Demo4 {
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("config.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test2() {
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}

	@Test
	public void test() {
		System.out.println(ctx.getBean("driver", Driver.class).getCar());
		ctx.getBean("userService", UserService.class).register(
				ctx.getBean("user", User.class));
	}

}
