package com.tyss.spring.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HibernatUtil {
	public static Session openSession() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		return factory.openSession();
	}
}	

