package com.flyingh.vo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Driver implements ApplicationContextAware {
	private String name;
	private ApplicationContext ctx;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return ctx.getBean("car", Car.class);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		ctx = applicationContext;
	}
}
