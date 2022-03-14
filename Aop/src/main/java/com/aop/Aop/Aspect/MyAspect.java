package com.aop.Aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect
public class MyAspect {
//adviser
@Before("execution(* com.aop.Aop.services.PaymentServiceImpl.makePayment())")
public void printBefore() {
System.out.println("Payment Started");
}
}