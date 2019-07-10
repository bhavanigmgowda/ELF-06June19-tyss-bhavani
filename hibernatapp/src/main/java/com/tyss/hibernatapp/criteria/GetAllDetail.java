package com.tyss.hibernatapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class GetAllDetail {
	public static void main(String[] args) {
	SessionFactory factory	=HibernatUtil.getSessionFactory();
	Session session=factory.openSession();
	
	Criteria criteria= session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> list = criteria.list();
		for(EmployeeInfoBean bean:list) {
			log.info(""+bean);
		}

	}

}
