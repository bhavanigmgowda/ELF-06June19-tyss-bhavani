package com.tyss.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.spring.employeebeans.EmployeeInfoBean;
import com.tyss.spring.util.HibernatUtil;

public class EmployeeDAOHibernatImpl2 implements EmployeeDAO {

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session factory = HibernatUtil.openSession();
		String hql = "from EmployeeInfoBean ";
		Query query = factory.createQuery(hql);
		List<EmployeeInfoBean> emp = query.list();
		return emp;
	}

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernatUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(id);

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernatUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		Transaction txn = null;
		bean.setId(id);
		try {
			Session session = HibernatUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(id);
	}

}
