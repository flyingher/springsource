package com.flyingh.vo;

public class Orange {
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
		System.out.println("3.Orange.init()");
	}

	@SuppressWarnings("unused")
	private void destroy() {
		System.out.println("4.Orange.destroy()");
	}
}
