package com.flyingh.demo;

import java.io.PrintStream;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;

import junit.framework.Assert;

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
	public void test7() {
		PrintStream out = ctx.getBean("fieldFactoryBean", PrintStream.class);
		System.out.println(out);
		out.println("hello world!!!");
		String str = ctx.getBean("ffb", String.class);
		System.out.println(str);
	}

	@Test
	public void test6() {
		String str1 = ctx.getBean("stringFactoryBean", String.class);
		String str2 = ctx.getBean("stringFactoryBean", String.class);
		System.out.println(str1 == str2);
		Assert.assertSame(str1, str2);
		Integer integer1 = ctx.getBean("integerFactoryBean", Integer.class);
		Integer integer2 = ctx.getBean("integerFactoryBean", Integer.class);
		System.out.println(integer1 == integer2);
		Assert.assertSame(integer1, integer2);
	}

	@Test
	public void test5() {
		User user1 = ctx.getBean("factoryBean", User.class);
		User user2 = ctx.getBean("factoryBean", User.class);
		System.out.println(user1);
		System.out.println(user2);
		Assert.assertNotSame(user1, user2);
	}

	@Test
	public void test4() {

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
