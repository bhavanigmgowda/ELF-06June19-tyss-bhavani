package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.mywebapp.bean.EmployeeInfoBean;


public class CreateDeptServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Configuration cfg=	new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeInfoBean   .class);
		
			SessionFactory factory=	cfg.buildSessionFactory();
			Session session= factory.openSession();
			
			EmployeeInfoBean emp=new EmployeeInfoBean();
			emp.setId(106);
			emp.setName("bhavani");
			emp.setAccountNumber(5245456);
			emp.setAge(23);
			emp.setDesignation("HR");
			emp.setDob(new Date(2018-2-07));
			emp.setEmail("bhg@gmail");
			emp.setGender("f");
	}
}
