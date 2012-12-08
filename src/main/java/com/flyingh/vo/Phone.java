package com.flyingh.vo;

public class Phone {
	public void dial() {
		System.out.println("Phone.dial()");
	}

	public void sendMsg() {
		System.out.println("Phone.sendMsg()");
	}

	public void throwException() throws Exception {
		throw new Exception();
	}

	public String sayHello(String name) {
		return name + ",Hello";
	}
}
