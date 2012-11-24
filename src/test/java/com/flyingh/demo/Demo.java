package com.flyingh.demo;

import java.io.InputStream;

import org.junit.Test;
import org.springframework.util.Assert;

public class Demo {
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
