package com.flyingh.vo;

public class Desk {
	private String name;

	public void info() {
		System.out.println("the desk's name is " + name + "!");
	}

	public static String sayHello(String name) {
		return name + ",Hello World!!!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
