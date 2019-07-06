package com.tyss.hibernatapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.EmployeeOtherInfoBean;

public class UpdateRecordOtherInfo {
	public static void main(String[] args) {
		Configuration cong = new Configuration();
		cong.configure("hibernate.cfg.xml");
		cong.addAnnotatedClass(EmployeeOtherInfoBean.class);
		SessionFactory factory = cong.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean emp = session.get(EmployeeOtherInfoBean.class, 10);
		emp.setEmergencyContactName("bhavani");

		Transaction transaction = session.beginTransaction();
		session.update(emp);
		transaction.commit();
		session.close();

	}

}
