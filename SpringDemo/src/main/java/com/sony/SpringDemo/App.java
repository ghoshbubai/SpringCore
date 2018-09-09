package com.sony.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Cricketer c1 = (Cricketer) context.getBean("cricketer");

		System.out.println(c1);

	}
}
