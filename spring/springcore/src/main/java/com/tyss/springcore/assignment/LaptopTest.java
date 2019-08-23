package com.tyss.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.EmpBean;

public class LaptopTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop messageBean=context.getBean(Laptop.class);
		messageBean.showSpecification(); 
	}
} 
 