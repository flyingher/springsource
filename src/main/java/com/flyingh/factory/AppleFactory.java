package com.flyingh.factory;

import com.flyingh.vo.Apple;

public class AppleFactory {
	public static Apple newInstance() {
		System.out.println("AppleFactory.newInstance()");
		return new Apple();
	}

	public static Apple getApple(String name, float weight) {
		System.out.println("AppleFactory.getApple()");
		System.out.println(name + "-->" + weight);
		return new Apple(name, weight);
	}

	public Apple getInstance() {
		System.out.println("AppleFactory.getInstance()");
		return new Apple();
	}
}
