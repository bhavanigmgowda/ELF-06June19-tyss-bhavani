package com.tyss.mywebapp.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.tyss.mywebapp.bean.EmployeeInfoBean;
import com.tyss.mywebapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernatImpl implements EmployeeDAO {
	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session factory = HibernatUtil.openSession();
		String hql="from EmployeeInfoBean ";
		Query query=factory.createQuery(hql);
		
		List<EmployeeInfoBean> emp=query.list();
			
		return emp;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernatUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try(Session session = HibernatUtil.openSession();) {
			
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			
			log.info(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
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
		EmployeeInfoBean bean = new EmployeeInfoBean();
		Transaction txn = null;
		bean.setId(id);
		try(Session session = HibernatUtil.openSession();) {
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.info(Arrays.toString(e.getStackTrace()));
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(id);
	}

}
