package com.tyss.springcurd;


import java.util.Date;
import java.util.List;

import com.tyss.spring.dao.EmployeeDAO;
import com.tyss.spring.dao.EmployeeDAOFactory;
import com.tyss.spring.employeebeans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class EmpTest {
	public static void main(String[] args) {
		EmployeeDAO dao=EmployeeDAOFactory.getinstance();
		EmployeeInfoBean emp=new EmployeeInfoBean();
	emp.setId(106);
	emp.setName("bhavani");
	emp.setAccountNumber(5245456);
	emp.setAge(23);
	emp.setDepartmentId(10);
	emp.setDesignation("HR");
	emp.setDob(new Date(2018-2-07));
	emp.setEmail("bhg@gmail");
	emp.setGender("f");
	emp.setJoiningDate(new Date(2018-10-12));
	emp.setManagerId(6);
	emp.setPhnum(6576545);
	emp.setSalary(200000);
	
	dao.createEmployeeInfo(emp);

	
	
	}
	private static void printInfo(EmployeeInfoBean bean) {
		log.info("***************************************************************************");
		log.info("                                                                            ");
		
		log.info("ID="+bean.getId());
		log.info("Name="+bean.getName());
		log.info("MGRID="+bean.getManagerId());
		log.info("phnum="+bean.getPhnum());
		log.info("salary="+bean.getSalary());
		log.info("Email="+bean.getEmail());
		log.info("Gender="+bean.getGender());
		log.info("Designation="+bean.getDesignation());
		log.info("DepartmentId="+bean.getDepartmentId());
		log.info("Age="+bean.getAge());
		log.info("AccountNumber="+bean.getAccountNumber());
	}
}
