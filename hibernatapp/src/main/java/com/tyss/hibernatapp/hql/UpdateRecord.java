package com.tyss.hibernatapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {

	public static void main(String[] args) {
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "update from EmployeeInfoBean set name=:ename where id=:eid";
		//String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id='"+Integer.parseInt(args[1])+"'";
		Query query = session.createQuery(hql);
		query.setParameter("ename",args[0]);
		query.setParameter("eid", Integer.parseInt(args[1]));
		Transaction t=null;
		try {
			t = session.beginTransaction();
			int i = query.executeUpdate();
			log.info("" + i);
			t.commit();

		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
