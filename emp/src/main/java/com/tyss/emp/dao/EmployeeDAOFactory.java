package com.tyss.emp.dao;


public class EmployeeDAOFactory {
	private static  String dbInteractionType="hibernat";
	
	private EmployeeDAOFactory(){
		
	}
	
	public static EmployeeDAO getinstance() {
		
		EmployeeDAO dao=null;
		if(dbInteractionType.equals("jdbc")) {
			//dao=new EmployeeDAOJDBCImpl();
		}
		else if(dbInteractionType.equals("hibernat")) {
			dao=new EmployeeDAOHibernatImpl();
		}
		return dao;
	}
}
