package com.tyss.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.mywebapp.bean.EmployeeInfoBean;


public interface EmployeeDAO {
	EmployeeInfoBean getEmployeeInfo(int id);
	List<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);

}
