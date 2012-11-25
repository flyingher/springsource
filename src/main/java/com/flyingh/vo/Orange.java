package com.flyingh.vo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Orange implements InitializingBean, DisposableBean {
	private String name;

	public Orange() {
		super();
		System.out.println("1.Orange.Orange()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("2.Orange.setName()");
		this.name = name;
	}

	@SuppressWarnings("unused")
	private void init() {
		System.out.println("4.Orange.init()");
	}

	@SuppressWarnings("unused")
	private void close() {
		System.out.println("6.Orange.close()");
	}

	public void destroy() throws Exception {
		System.out.println("5.Orange.destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("3.Orange.afterPropertiesSet()");
	}
}
