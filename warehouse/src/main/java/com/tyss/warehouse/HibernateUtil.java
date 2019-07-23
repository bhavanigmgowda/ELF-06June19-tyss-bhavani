package com.tyss.warehouse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hibernateUtil")
public class HibernateUtil {
	@Autowired
	private SessionFactory factory = null;

	public Session openSession() {
		return factory.openSession();
	}

	public SessionFactory getSession() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}

}
