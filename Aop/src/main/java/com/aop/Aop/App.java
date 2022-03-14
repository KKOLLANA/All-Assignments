package com.aop.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.aop.Aop.services.PaymentServices;



public class App
{
public static void main( String[] args )
{
ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/Aop/config.xml");
PaymentServices ps = context.getBean("payment", PaymentServices.class);
//Auto, print:PaymentStarted
ps.makePayment();
}
}