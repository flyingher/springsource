package com.flyingh.aspect;

public class AfterReturingAspect {
	public void afterReturing(Object result) {
		System.out.println("AfterReturingAspect.afterReturing()" + result);
	}
}
