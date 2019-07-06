package com.tyss.hibernatapp;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernatapp.dto.EmployeeOtherInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

public class SaveDataEmpOther {
	public static void main(String[] args) {
		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
		 * 
		 * SessionFactory factory = cfg.buildSessionFactory(); Session session =
		 * factory.openSession();
		 */
		
		SessionFactory factory=HibernatUtil.getSessionFactory();
		Session session=factory.openSession();
	

		EmployeeOtherInfoBean emp = new EmployeeOtherInfoBean();
		emp.setId(104);
		emp.setAdhar(878545);
		emp.setBloodGroup("a+");
		emp.setEmergencyContactName("bhgg");
		emp.setEmergencyContactNumber(54654251);
		emp.setFatherNm("hkjh");
		emp.setHusbandNm("no");
		emp.setIsChallenged("no");
		emp.setIsMarried("no");
		emp.setMotherNm("jkgjh");
		emp.setNationality("hindu");
		emp.setPan(348786);
		emp.setPassport(5677454);
		emp.setReligion("indian");
		emp.setSpouseNm("no");
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(emp);
		transaction.commit();
		session.close();

	}
}
