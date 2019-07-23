package com.tyss.hibernatapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernatapp.onetoone.util.HibernatUtil;
import com.tyss.hibernatapp.util.PreparedDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernatOneToOne { 

	public static void main(String[] args) {

		int id = 133;
		EmployeeInfoBean bean = PreparedDataUtil.prepareData(id);
		save(bean);

	}

	public static void save(EmployeeInfoBean bean) {
		Transaction transaction = null;
		try (Session session = HibernatUtil.openSession()) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean); 
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}
