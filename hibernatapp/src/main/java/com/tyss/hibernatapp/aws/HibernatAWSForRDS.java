package com.tyss.hibernatapp.aws;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class HibernatAWSForRDS {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("com/tyss/hibernatapp/aws/hibernateaws.cfg.xml");
		con.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Criteria criteria= session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> list = criteria.list();
		for(EmployeeInfoBean bean:list) {
			log.info(""+bean);
		}
		
	}

}
