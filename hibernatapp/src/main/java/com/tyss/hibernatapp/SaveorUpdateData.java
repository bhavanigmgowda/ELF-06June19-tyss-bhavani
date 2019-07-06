package com.tyss.hibernatapp;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;

public class SaveorUpdateData {
	public static void main(String[] args) {
	Configuration cfg=	new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(EmployeeInfoBean.class);
	
		SessionFactory factory=	cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		
		
		EmployeeInfoBean emp=new EmployeeInfoBean();
		emp.setId(103);
		emp.setName("bhavani");
		emp.setAccountNumber(5245456);
		emp.setAge(23);
		emp.setDeptId(6);
		emp.setDesignation("HR");
		emp.setDob(new Date(2018-2-07));
		emp.setEmail("bhg@gmail");
		emp.setGender("f");
		emp.setJoiningDate(new Date(2018-10-12));
		emp.setMngrId(6);
		emp.setPhnum(6576545);
		emp.setSalary(200000);
		
		Transaction transaction =session.beginTransaction();
		session.saveOrUpdate(emp);
       transaction.commit();
		session.close();
		
	}
}
