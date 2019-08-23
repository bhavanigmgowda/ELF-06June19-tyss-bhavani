package com.tyss.spring.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.spring.employeebeans.EmployeeInfoBean;

public class EmployeeDAOHibernatImpl implements EmployeeDAO {
	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		//TO DO
		return null;
	}
	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
	
		Configuration cfg=	new Configuration();
		cfg.configure();
		
		
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.Build the SessionFactory
			SessionFactory factory=	cfg.buildSessionFactory();
		//3.open session
			Session session= factory.openSession();
		//4.interact with BD via Session
			EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
		//5.close session.	
			session.close();
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(id);

	}
	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
