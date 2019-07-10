package com.tyss.hibernatapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/tyss/hibernatapp/cache/hibernate.cache.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		EmployeeInfoBean infoEx=session.get(EmployeeInfoBean.class, 10);
		log.info(""+infoEx.toString());
		/*
		 * EmployeeInfoBean infoEx1=session.get(EmployeeInfoBean.class, 10);
		 * 
		 * log.info(""+infoEx1.toString());
		 * 
		 * EmployeeInfoBean infoEx2=session.get(EmployeeInfoBean.class, 10);
		 * log.info(""+infoEx2.toString());
		 */
	}
	
}
