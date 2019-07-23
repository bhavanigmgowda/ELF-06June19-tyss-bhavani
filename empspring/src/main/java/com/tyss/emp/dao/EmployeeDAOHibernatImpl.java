package com.tyss.emp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.util.HibernatUtil;
import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernatImpl implements EmployeeDAO {
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernatUtil.openSession();
		String hql = "from EmployeeInfoBean"; 
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list(); 
		return employeeInfoBeans;		
	}
	
	  public List<EmployeeInfoBean> getAllSearchedEmployee(String id) {
	  
		  Session session = HibernatUtil.openSession(); 
		  String hql ="from EmployeeInfoBean where id like '" +id+ "%'"; 
		  Query query = session.createQuery(hql); List<EmployeeInfoBean> employeeInfoBeans =
		  query.list(); return employeeInfoBeans; 
	  }
	 
	

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean empinf = null;
		try(Session session = HibernatUtil.openSession();) {
			empinf = session.get(EmployeeInfoBean.class, id);
		}
		return empinf;
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction tm = null;
		try(Session session = HibernatUtil.openSession();) {
			tm = session.beginTransaction();
			session.saveOrUpdate(bean);
			tm.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(tm != null) {
				tm.rollback();
			}
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
		Transaction tm = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernatUtil.openSession();
			tm = session.beginTransaction();
			session.delete(bean);
			tm.commit();
			return true;
		} catch (Exception e) {
			tm.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
