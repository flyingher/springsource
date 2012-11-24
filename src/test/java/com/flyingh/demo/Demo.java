package com.flyingh.demo;

import java.io.InputStream;

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
