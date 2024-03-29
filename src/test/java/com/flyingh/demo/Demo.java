package com.flyingh.demo;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

import com.flyingh.vo.Student;
import com.flyingh.vo.User;
import com.flyingh.vo.Worker;

@SuppressWarnings("deprecation")
public class Demo {
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void test7() throws IntrospectionException {
		PropertyDescriptor[] pds = Introspector.getBeanInfo(User.class)
				.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			System.out.println(pd.getName());
		}
		System.out.println(pds.length);
	}

	@Test
	public void test6() throws Exception {
		User user1 = ctx.getBean("user", User.class);
		User user2 = ctx.getBean("/user", User.class);
		User user3 = ctx.getBean("uu", User.class);
		assertSame(user1, user2);
		assertSame(user2, user3);
		Date date1 = ctx.getBean("date", Date.class);
		Thread.sleep(1000);
		Date date2 = ctx.getBean("date", Date.class);
		assertNotSame(date1, date2);
		System.out.println(date1);
		System.out.println(date2);
	}

	@Test
	public void test5() throws IOException {
		// InputStream is = ctx.getResource("info.log").getInputStream();
		// InputStream is =
		// ctx.getResource("classpath:info.log").getInputStream();
		InputStream is = ctx.getResource("http://www.springsource.org")
				.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		System.out.println(new String(os.toByteArray()));
	}

	@Test
	public void test4() {
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
		System.out.println(ctx.getBean("system", System.class));
	}

	@Test
	public void test2() {
		new XmlBeanFactory(new ClassPathResource("beans.xml"));
		System.out.println("*************");
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
