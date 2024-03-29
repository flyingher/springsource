package com.flyingh.demo;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.swing.JFrame;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flyingh.bean.FieldFactoryBean;
import com.flyingh.bean.MyBean;
import com.flyingh.vo.Boy;
import com.flyingh.vo.Driver;
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
	public void test16() {
		System.out.println(ctx.getBean("err", PrintStream.class));
		System.out.println(ctx.getBean("catName2", String.class));
		System.out.println(ctx.getBean("list", List.class));
		System.out.println(ctx.getBean("list", List.class).getClass());
		System.out.println(ctx.getBean("set", Set.class));
		System.out.println(ctx.getBean("set", Set.class).getClass());
		System.out.println(ctx.getBean("map", Map.class));
		System.out.println(ctx.getBean("map", Map.class).getClass());
		System.out.println(ctx.getBean("properties", Properties.class));
		System.out.println(ctx.getBean("properties", Properties.class)
				.getClass());
		System.out.println(ctx.getBean("messages", Properties.class));
		System.out
				.println(ctx.getBean("messages", Properties.class).getClass());
	}

	@Test
	public void test15() throws InterruptedException {
		JFrame frame = ctx.getBean("frame", JFrame.class);
		frame.setBounds(300, 200, 500, 300);
		frame.setTitle("setBackground test");
		frame.setVisible(true);
		Thread.sleep(5000);
	}

	@Test
	public void test14() {
		System.out.println(ctx.getBean("info"));
		System.out.println(ctx.getBean("name", String.class));
		System.out.println(ctx.getBean("hello", String.class));
		System.out.println(ctx.getBean("hi", String.class));
	}

	@Test
	public void test13() {
		System.out.println(ctx.getBean("bananaName", String.class));
		System.out.println(ctx.getBean("pi", Double.class));
		System.out.println(ctx.getBean("e", Double.class));
	}

	@Test
	public void test12() {
		String catName = ctx.getBean("catName", String.class);
		System.out.println(catName);
		System.out.println(ctx.getBean("owner.cat.name", String.class));
	}

	@Test
	public void test11() {
		System.out.println(ctx.getBean("boy", Boy.class).newDog());
		System.out.println(ctx.getBean("boy", Boy.class).newDog());
		System.out.println(ctx.getBean("boy", Boy.class).getClass());
	}

	@Test
	public void test10() {
		System.out.println(ctx.getBean("driver", Driver.class).getCar());
		System.out.println(ctx.getBean("driver", Driver.class).getCar());
		System.out.println(ctx.getBean("car"));
		System.out.println(ctx.getBean("car"));
	}

	@Test
	public void test9() {
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}

	@Test
	public void test8() {
		MyBean myBean = ctx.getBean("myBean", MyBean.class);
		System.out.println(myBean.getName());
	}

	@Test
	public void test7() {
		PrintStream out = ctx.getBean("fieldFactoryBean", PrintStream.class);
		System.out.println(out);
		out.println("hello world!!!");
		String str = ctx.getBean("ffb", String.class);
		System.out.println(str);
		System.out.println(ctx.getBean("&ffb", FieldFactoryBean.class));
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
