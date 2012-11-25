package com.flyingh.demo;

import java.util.Map;
import java.util.Map.Entry;

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
	public void test4(){
		
	}

	@Test
	public void test3() {
		User user = ctx.getBean("user", User.class);
		System.out.println("*******List*******");
		for (String str : user.getList()) {
			System.out.println(str);
		}
		System.out.println("*******Set*******");
		for (Integer integer : user.getSet()) {
			System.out.println(integer);
		}
		System.out.println("*******Map*******");
		for (Map.Entry<String, Integer> me : user.getMap().entrySet()) {
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
		System.out.println("*******Properties*******");
		for (Entry<Object, Object> me : user.getProperties().entrySet()) {
			System.out.println(me.getKey() + "--->" + me.getValue());
		}
		System.out.println("*******Array*******");
		for (String str : user.getStrs()) {
			System.out.println(str);
		}
	}

	@Test
	public void test2() {
		User user = ctx.getBean("user", User.class);
		System.out.println(user);
		System.out.println(user.getName() + "-->" + user.getBirthday());
	}

	@Test
	public void test() throws InterruptedException {
		ctx.getBean(JFrame.class);
		Thread.sleep(5000);
	}

}
