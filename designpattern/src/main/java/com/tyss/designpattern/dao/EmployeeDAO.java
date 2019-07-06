package com.tyss.designpattern.dao;

import java.util.ArrayList;

import com.tyss.designpattern.employeebeans.EmployeeInfoBean;

public interface EmployeeDAO {
	EmployeeInfoBean getEmployeeInfo(int id);
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);

}
