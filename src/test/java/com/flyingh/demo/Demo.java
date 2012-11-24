package com.flyingh.demo;

import java.io.InputStream;
import java.util.Locale;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

import com.flyingh.vo.Student;
import com.flyingh.vo.Worker;

@SuppressWarnings("deprecation")
public class Demo {
	@Test
	public void test4() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		System.out.println(ctx.getMessage("info", new String[] { "flyingh" },
				Locale.getDefault()));
		System.out.println(ctx.getMessage("info", new String[] { "飞天" },
				Locale.CHINA));
		System.out.println(ctx.getMessage("msg", new String[] { "I", "you" },
				Locale.US));
		System.out.println(ctx.getMessage("msg", new String[] { "我", "你" },
				Locale.CHINA));
	}

	@Test
	public void test3() {
		System.out.println(System.lineSeparator().length());
		System.out.println(new ClassPathXmlApplicationContext("beans.xml")
				.getBean("system", System.class));
	}

	@Test
	public void test2() {
		new XmlBeanFactory(new ClassPathResource("beans.xml"));
		System.out.println("*************");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		System.out.println(ctx.getBean("student", Student.class));
		System.out.println(ctx.getBean("worker", Worker.class));
	}

	@Test
	public void test() {
		InputStream is = getClass().getResourceAsStream("/beans.xml");
		Assert.notNull(is);
		System.out.println(is);
		is = getClass().getClassLoader().getResourceAsStream("beans.xml");
		Assert.notNull(is);
		System.out.println(is);
	}
}
