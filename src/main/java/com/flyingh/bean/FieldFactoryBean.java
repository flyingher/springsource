package com.flyingh.bean;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class FieldFactoryBean implements FactoryBean<Object> {
	private String fieldName;
	private String className;

	public Object getObject() throws Exception {
		Class<?> cls = Class.forName(className);
		Field field = cls.getDeclaredField(fieldName);
		field.setAccessible(true);
		return field.get(cls);
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
