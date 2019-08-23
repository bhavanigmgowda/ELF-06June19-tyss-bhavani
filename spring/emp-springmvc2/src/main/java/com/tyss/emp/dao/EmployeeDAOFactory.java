package com.tyss.emp.dao;



import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	@Bean("jdbc")
	public static EmployeeDAO getinstance2() {
			 return new EmployeeDAOJDBCImpl();			
	}

	@Bean("hibernat")
	public static EmployeeDAO getinstance() {
		return new EmployeeDAOHibernatImpl();
	}

}
