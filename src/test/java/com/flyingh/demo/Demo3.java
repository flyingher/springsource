package com.flyingh.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Demo3 {
	private ExpressionParser parser;

	@Before
	public void setUp() throws Exception {
		parser = new SpelExpressionParser();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(3, parser.parseExpression("1+2-4/2+8%3").getValue());
	}

}
