package com.tyss.hibernatapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatUtilCache {
	HibernatUtilCache cache=new HibernatUtilCache();
	private static SessionFactory factory=null;
	private HibernatUtilCache() {
		
	}
	private static SessionFactory getSessionFactory() {
		if(factory==null) 
			factory=buildFactory();
		return factory;
		
	}
	private static SessionFactory buildFactory() {
		Configuration con=new Configuration();
		con.configure("com/tyss/hibernatapp/cache/hibernate.cache.cfg.xml");
		con.addAnnotatedClass(EmployeeInfoBean.class);
		return con.buildSessionFactory();
	}
	public static Session openSesion() {
		return buildFactory().openSession();
	}
	

}
