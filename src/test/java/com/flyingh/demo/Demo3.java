package com.flyingh.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.flyingh.vo.Girl;

public class Demo3 {
	private ExpressionParser parser;
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		parser = new SpelExpressionParser();
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test4() {
		Girl girl = ctx.getBean("girl", Girl.class);
		System.out.println(girl.getBook());
		System.out.println(girl.getPencil());
		System.out.println(girl.getList());
		System.out.println(girl);
	}

	@Test
	public void test3() {
		System.out.println(parser.parseExpression("{'a','b','c','d','e'}")
				.getValue());
		System.out.println(parser.parseExpression("{'a','b','c','d','e'}")
				.getValue().getClass());
	}

	@Test
	public void test2() {
		int[] value = (int[]) parser.parseExpression("new int[]{1,2,3,4,5}")
				.getValue();
		System.out.println(Arrays.toString(value));
	}

	@Test
	public void test() {
		assertEquals(3, parser.parseExpression("1+2-4/2+8%3").getValue());
	}

}
