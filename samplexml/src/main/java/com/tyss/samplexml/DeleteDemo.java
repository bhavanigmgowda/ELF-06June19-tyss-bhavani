package com.tyss.samplexml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;

public class DeleteDemo {
	public static void main(String[] args) {
		Configuration cong = new Configuration();
		cong.configure("hibernate.cfg.xml");
		cong.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cong.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 103);
		
		Transaction transaction = session.beginTransaction();
		session.delete(emp);
		transaction.commit();
		session.close();

	}

}
