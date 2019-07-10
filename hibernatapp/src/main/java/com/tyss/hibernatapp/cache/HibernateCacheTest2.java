package com.tyss.hibernatapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {

	public static void main(String[] args) {
		log.info("1st" + getEmployeeData(10).toString());
		log.info("2st" + getEmployeeData(10).toString());
		log.info("3st" + getEmployeeData(10).toString());

	}

	private static EmployeeInfoBean getEmployeeData(int id) {

		try(Session session = HibernatUtilCache.openSesion();){

		EmployeeInfoBean bean= session.get(EmployeeInfoBean.class, id);
		return bean;
	}

	}
}
