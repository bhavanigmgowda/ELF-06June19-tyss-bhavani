package com.tyss.samplexml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.DepartmentInfoBean;
import com.tyss.hibernatapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class SaveRecord {
	public static void main(String[] args) {
		
		Configuration cong=	new Configuration();

		cong.configure("hibernate.cfg.xml");
		SessionFactory factory = cong.buildSessionFactory();
		Session session = factory.openSession();
		DepartmentInfoBean emp = session.get(DepartmentInfoBean.class, 10);
		log.info(""+emp.getDeptName()); 

		
	}

}
