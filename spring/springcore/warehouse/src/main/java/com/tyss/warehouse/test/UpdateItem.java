package com.tyss.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.warehouse.ItemBean;
import com.tyss.warehouse.ItemConfig;

public class UpdateItem {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean bean = session.get(ItemBean.class,1 );
		bean.setCost(333);
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bean);
		transaction.commit();
		session.close();

	}
	
	
}
