package com.flyingh.vo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Driver implements ApplicationContextAware {
	private String name;
	private Car car;
	private ApplicationContext ctx;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		car = ctx.getBean("car", Car.class);
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.ctx = applicationContext;
	}
}
