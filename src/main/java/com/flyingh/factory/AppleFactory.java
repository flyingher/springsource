package com.flyingh.factory;

import com.flyingh.vo.Apple;

public class AppleFactory {
	public static Apple newInstance() {
		System.out.println("AppleFactory.newInstance()");
		return new Apple();
	}
}
