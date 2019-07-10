package com.tyss.hibernatapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecordDynamic {

	public static void main(String[] args) {
		SessionFactory factory = HibernatUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "delete from EmployeeInfoBean  where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 103);
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
