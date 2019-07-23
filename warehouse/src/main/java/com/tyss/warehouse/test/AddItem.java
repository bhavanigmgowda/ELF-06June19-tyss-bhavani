package com.tyss.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.warehouse.ItemBean;
import com.tyss.warehouse.ItemConfig;

public class AddItem {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean bean = new ItemBean();
		bean.setItemID(2);
		bean.setCapacity(1);
		bean.setCost(254);
		bean.setDescription("abc");
		bean.setItemName("pen");
		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();

	}
	
	
}
