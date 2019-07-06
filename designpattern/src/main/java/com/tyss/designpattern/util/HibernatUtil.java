package com.tyss.designpattern.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.employeebeans.EmployeeInfoBean;


public class HibernatUtil {
	static SessionFactory factory = null;
	HibernatUtil h = new HibernatUtil();

	private HibernatUtil() {
		
	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure()
					.addAnnotatedClass(EmployeeInfoBean.class)
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

