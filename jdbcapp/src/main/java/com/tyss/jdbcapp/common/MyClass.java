package com.tyss.jdbcapp.common;

public class MyClass {
	private MyClass() {
		
	}
	public static Connection getInstance(String str) {
		Connection ref=null;
		if(str.equals("one")) {
			 ref=new DiverManger();
		}else {
			ref=new Driver1();
		}
		return ref;
	}

}
