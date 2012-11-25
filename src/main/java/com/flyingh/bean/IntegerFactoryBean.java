package com.flyingh.bean;

import org.springframework.beans.factory.FactoryBean;

public class IntegerFactoryBean implements FactoryBean<Integer> {

	public Integer getObject() throws Exception {
		return 127;
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
