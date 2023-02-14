package com.springcore.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class FirstAspect {
	@Before("execution(* com.springcore.aspect.PaymentServiceImp.makePayment)")
	public void print() {
		System.out.println("payment started");
	}
}
