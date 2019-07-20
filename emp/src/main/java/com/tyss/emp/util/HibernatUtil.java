package com.tyss.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernatUtil {
	static SessionFactory factory = null;
	HibernatUtil h = new HibernatUtil();

	private HibernatUtil() {
		
	}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
					.configure()
					.addAnnotatedClass(com.tyss.emp.dao.EmployeeInfoBean.class)
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

