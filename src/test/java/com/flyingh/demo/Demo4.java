package com.flyingh.demo;

import java.sql.SQLException;

import javax.sql.DataSource;

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
	public void test3() throws SQLException {
		DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());
		System.out.println("*****************");
		DataSource ds = ctx.getBean("ds", DataSource.class);
		System.out.println(ds);
		System.out.println(ds.getConnection());
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
