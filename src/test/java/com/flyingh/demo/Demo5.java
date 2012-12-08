package com.flyingh.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flyingh.vo.Phone;

public class Demo5 {
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("aop_config.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Phone phone = ctx.getBean("phone", Phone.class);
		phone.sendMsg();
		phone.dial();
		try {
			phone.throwException();
		} catch (Exception e) {
			System.out.println(e);
		}
		phone.sayHello("flyingh");
	}

}
