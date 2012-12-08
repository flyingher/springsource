package com.flyingh.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAspect {
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("AroundAspect.around()");
		System.out.println(Arrays.asList(joinPoint.getArgs()));
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getThis());
		System.out.println(joinPoint.getThis().getClass());
		System.out.println(joinPoint.getTarget());
		System.out.println(joinPoint.getTarget().getClass());
		return joinPoint.proceed() + " world!!!";
	}
}
