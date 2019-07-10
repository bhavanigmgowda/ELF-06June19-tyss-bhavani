package com.tyss.hibernatapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class CallStoreProcedure {

	public static void main(String[] args) {
		SessionFactory factory=HibernatUtil.getSessionFactory();
		Session session=factory.openSession();
		StoredProcedureQuery query= session.createStoredProcedureCall("employee_info_sp");
		 List<Object[]> list=query.getResultList();
		 
		 for(Object[] bean:list) {
			 for(int i=0;i<bean.length;i++) {
			  log.info(""+bean[i]);
			 }
		 }
		
	}
	
}
