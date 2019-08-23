package com.tyss.emp.servlets;

import java.util.List;

import com.tyss.emp.dto.EmployeeInfoBean;


public interface EmployeeDAO {
	 List<EmployeeInfoBean> getAllEmployeeInfo();
	 EmployeeInfoBean getEmployeeInfo(String id);
	 EmployeeInfoBean getEmployeeInfo(int id);
	 boolean createEmployeeInfo(EmployeeInfoBean bean);
	 boolean updateEmployeeInfo(EmployeeInfoBean bean);
	 boolean deleteEmployeeInfo(int id);
	 boolean deleteEmployeeInfo(String id);
	 List<EmployeeInfoBean> getAllSearchedEmployee(String id);
}
