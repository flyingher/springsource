package com.flyingh.vo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Orange implements InitializingBean, DisposableBean,
		ApplicationContextAware, BeanNameAware, BeanPostProcessor,
		BeanFactoryPostProcessor {
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
		System.out.println("6.Orange.init()");
	}

	@SuppressWarnings("unused")
	private void close() {
		System.out.println("8.Orange.close()");
	}

	public void destroy() throws Exception {
		System.out.println("7.Orange.destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("5.Orange.afterPropertiesSet()");
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("4.Orange.setApplicationContext()");
	}

	public void setBeanName(String name) {
		System.out.println("3.Orange.setBeanName()");
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Orange.postProcessBeforeInitialization()");
		// return null;
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("Orange.postProcessAfterInitialization()");
		return null;
	}

	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Orange.postProcessBeanFactory()");
	}
}
