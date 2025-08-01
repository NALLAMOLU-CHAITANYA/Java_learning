package com.chaitanya.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/chaitanya/firstproject/NewFile.xml");
		
//		Vehicle obj = (Vehicle)context.getBean("car");
//		
//		obj.drive();
		
//		Tyre obj = (Tyre)context.getBean("tyre");
//		System.out.println(obj);
//		
		
		Car obj = (Car)context.getBean("car");
		obj.drive();
	}
}
