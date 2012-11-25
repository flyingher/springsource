package com.flyingh.bean;

import org.springframework.beans.factory.BeanNameAware;

public class MyBean implements BeanNameAware {
	private String name;

	public void setBeanName(String name) {
		this.name = name;
		System.out.println("AppleBean.setBeanName()");
	}

	public String getName() {
		return name;
	}

}
