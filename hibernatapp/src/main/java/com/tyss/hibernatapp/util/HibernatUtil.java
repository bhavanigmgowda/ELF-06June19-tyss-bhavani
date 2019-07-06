package com.tyss.hibernatapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernatUtil {
	static Configuration cfg = null;
	static SessionFactory factory = null;
	HibernatUtil h = new HibernatUtil();

	private HibernatUtil() {
		
	}

	private static SessionFactory buildSessionFactory() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		if(factory==null) 
			factory=buildSessionFactory();
			return factory;
		}
		
	}

