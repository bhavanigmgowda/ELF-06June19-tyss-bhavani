package com.tyss.javaapp.beanclass;

import java.util.logging.Logger;

public class TestEmp2 {
	private static final Logger loger=Logger.getLogger("bhavani");
	public static void main(String[] args) {
		 Emp2 e=new Emp2();
		 e.setName("bhavani");
		 e.setGender('f');
		 e.setId(10);
		loger.info("id= "+e.getId());
		loger.info("name= "+e.getGender());
		loger.info("gender= "+e.getName()); 
		 
	}

}
