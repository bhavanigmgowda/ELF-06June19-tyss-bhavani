package com.tyss.warehouse.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.warehouse.HibernateUtil;
import com.tyss.warehouse.ItemBean;

public class TestUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		Session session=applicationContext.getBean("hibernateUtil",HibernateUtil.class).openSession();
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
