package com.tyss.hibernatapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class SelectData {
	public static void main(String[] args) {
		Configuration cong = new Configuration();
		cong.configure("hibernate.cfg.xml");
		cong.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cong.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean emp = session.get(EmployeeInfoBean.class, 10);
		log.info(" id "+emp.getId());
		log.info(" name "+emp.getName());
		log.info(" Acc number"+emp.getAccountNumber());
		log.info("Age "+emp.getAge());
		log.info("Deptno "+emp.getDeptId());

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(emp);
		transaction.commit();
		session.close();

	}

}
