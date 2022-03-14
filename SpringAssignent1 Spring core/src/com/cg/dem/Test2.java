package com.cg.dem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test2 {
public static void main(String[] args) {



ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
Question java= context.getBean("question", Question.class);
java.displayInfo();
}



}