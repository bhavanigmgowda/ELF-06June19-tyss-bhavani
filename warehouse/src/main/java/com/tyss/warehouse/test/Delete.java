package com.tyss.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tyss.warehouse.ItemBean;
import com.tyss.warehouse.ItemConfig;

public class Delete {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean bean =session.get(ItemBean.class, 1);

		Transaction transaction = session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
	}
}
