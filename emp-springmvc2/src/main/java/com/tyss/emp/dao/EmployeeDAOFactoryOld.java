package com.tyss.emp.dao;


public class EmployeeDAOFactoryOld {
	private EmployeeDAOFactoryOld(){
		
	}
	public static EmployeeDAO getinstance(String ob) {
		EmployeeDAO dao=null;
		 String dbInteractionType=ob;

		if(dbInteractionType.equals("jdbc")) {
			//dao=new EmployeeDAOJDBCImpl();
		}
		else if(dbInteractionType.equals("hibernat")) {
			dao=new EmployeeDAOHibernatImpl();
		}
		return dao;
	}
}
