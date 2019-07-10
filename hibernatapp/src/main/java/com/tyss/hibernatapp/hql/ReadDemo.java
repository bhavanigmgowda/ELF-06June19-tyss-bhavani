package com.tyss.hibernatapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.tyss.hibernatapp.dto.EmployeeInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
	
		/*String hql = "  from EmployeeInfoBean";
		Query  query = session.createQuery(hql);*/
		
		String hql="select name from EmployeeInfoBean ";
		Query query=session.createQuery(hql);
		List<String> emp=query.list();
			log.info("name"+emp);
		
		}
		
	}


