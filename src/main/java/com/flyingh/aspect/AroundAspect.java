package com.flyingh.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAspect {
	public void around(ProceedingJoinPoint joinPoint) {
		System.out.println("AroundAspect.around()");
		System.out.println(Arrays.asList(joinPoint.getArgs()));
		System.out.println(joinPoint.getSignature());
	}
}
