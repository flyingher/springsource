package com.flyingh.factory;

import com.flyingh.vo.Apple;

public class AppleFactory {
	public static Apple newInstance() {
		System.out.println("AppleFactory.newInstance()");
		return new Apple();
	}

	public Apple getInstance() {
		System.out.println("AppleFactory.getInstance()");
		return new Apple();
	}
}
