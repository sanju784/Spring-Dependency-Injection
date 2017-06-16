package com.sanju.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.area();
		
		System.out.println("The points in Triangle are :");
		Shape shape = (Shape) context.getBean("triangle");
		shape .draw();
		
		System.out.println("The points in rectangle are :");
		shape = (Shape) context.getBean("rectangle");
		shape.draw();

	}

}
