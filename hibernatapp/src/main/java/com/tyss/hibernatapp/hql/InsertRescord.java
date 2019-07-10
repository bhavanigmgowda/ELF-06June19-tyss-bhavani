package com.tyss.hibernatapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class InsertRescord {
public static void main(String[] args) {
	SessionFactory factory=HibernatUtil.getSessionFactory();
	Session session = factory.openSession();
	String hql="insert into EmpInfoEx(id,name,email) select id,name,email from EmployeeInfoBean where id=10";
	Transaction transaction;
	try {
		transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		int res=query.executeUpdate();
		log.info("result="+res);
		transaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		session.close();

	}

	
}
	
}
