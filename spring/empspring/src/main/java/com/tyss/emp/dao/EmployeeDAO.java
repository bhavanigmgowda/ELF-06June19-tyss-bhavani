package com.tyss.emp.dao;

import java.util.List;

import com.tyss.emp.dto.EmployeeInfoBean;



public interface EmployeeDAO {
	
	  EmployeeInfoBean getEmployeeInfo(int id); 
	  List<EmployeeInfoBean>  getAllEmployeeInfo();
	  EmployeeInfoBean getEmployeeInfo(String id);
	  boolean createEmployeeInfo(EmployeeInfoBean bean);
	  boolean  updateEmployeeInfo(EmployeeInfoBean bean); 
	  boolean deleteEmployeeInfo(int id);
	  boolean deleteEmployeeInfo(String id);                                
	  List<EmployeeInfoBean> getAllSearchedEmployee(String id);

}
