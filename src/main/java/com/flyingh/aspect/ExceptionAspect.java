package com.flyingh.aspect;

public class ExceptionAspect {
	public void handleException(Throwable e) {
		System.out.println("ExceptionAspect.handleException()" + e);
	}
}
