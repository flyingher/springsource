package com.flyingh.bean;

import org.springframework.beans.factory.FactoryBean;

public class StringFactoryBean implements FactoryBean<String> {

	public String getObject() throws Exception {
		return "hello world!!!";
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
