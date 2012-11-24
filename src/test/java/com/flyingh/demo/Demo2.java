package com.flyingh.demo;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flyingh.vo.User;

public class Demo2 {
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test2(){
		User user = ctx.getBean("user",User.class);
		System.out.println(user);
		System.out.println(user.getName()+"-->"+user.getBirthday());
	}

	@Test
	public void test() throws InterruptedException {
		ctx.getBean(JFrame.class);
		Thread.sleep(5000);
	}

}
