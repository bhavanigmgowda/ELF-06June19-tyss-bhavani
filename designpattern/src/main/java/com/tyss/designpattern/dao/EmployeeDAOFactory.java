package com.tyss.designpattern.dao;


public class EmployeeDAOFactory {
	private static  String dbInteractionType="hibernat";
	
	private EmployeeDAOFactory(){
		
	}
	
	public static EmployeeDAO getinstance() {
		
		EmployeeDAO dao=null;
		if(dbInteractionType.equals("jdbc")) {
			dao=new EmployeeDAOJDBCImpl();
		}
		else if(dbInteractionType.equals("hibernat")) {
			dao=new EmployeeDAOHibernatImpl2();
		}
		return dao;
	}
	
}
