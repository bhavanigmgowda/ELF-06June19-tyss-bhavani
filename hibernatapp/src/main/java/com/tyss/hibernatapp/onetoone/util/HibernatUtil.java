package com.tyss.hibernatapp.onetoone.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.onetoone.EmployeeInfoBean;
import com.tyss.hibernatapp.onetoone.EmployeeOtherInfoBean;



public class HibernatUtil {
	static SessionFactory factory = null;
	HibernatUtil h = new HibernatUtil();

	private HibernatUtil() {
		
	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(EmployeeInfoBean.class)
					.addAnnotatedClass(EmployeeOtherInfoBean.class)
					.buildSessionFactory(); 
	}
	
	private  static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionFactory();
		}
			return factory;
		}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
		
	}

