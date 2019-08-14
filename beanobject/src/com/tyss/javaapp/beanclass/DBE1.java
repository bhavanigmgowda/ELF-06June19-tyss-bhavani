package com.tyss.javaapp.beanclass;

public class DBE1 {
	void pass(Emp e)
	{
		System.out.println("********DB1*******");
		System.out.println("name="+e.getId());
		System.out.println("age="+e.getName());
		System.out.println("gender="+e.getGender());
	}
}
