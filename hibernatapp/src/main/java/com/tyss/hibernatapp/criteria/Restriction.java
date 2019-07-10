package com.tyss.hibernatapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class Restriction {
	public static void main(String[] args) {
		SessionFactory factory=HibernatUtil.getSessionFactory();
		Session session=factory.openSession();
		
		/*
		 * Criteria criteria=session.createCriteria(EmployeeInfoBean.class); Criterion
		 * cr=Restrictions.eq("id",1);
		 */
		
		 Criteria criteria=session.createCriteria(EmployeeInfoBean.class)
				 					.add(Restrictions.gt("salary",20000.00))
				 					.add(Restrictions.gt("deptId",5));
		
		
	List< EmployeeInfoBean> bean= criteria.list();
	for(EmployeeInfoBean bean2:bean) {
	log.info("employee details="+bean2);
		  
	}
	}

}
