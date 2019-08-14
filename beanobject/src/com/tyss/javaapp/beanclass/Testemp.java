package com.tyss.javaapp.beanclass;

public class Testemp {
public static void main(String[] args) {
	Emp e=new Emp();
	DBE1 d=new DBE2();
	DBE2 d1=null;
	e.setId(10);
	e.setName("bhavani");
	e.setGender('f');
	d.pass(e);	
	e.setId(20);
	
	e.setName("anjali");
	e.setGender('f');
	//d1.pass(e);
	if(d1 instanceof DBE2)
		System.out.println("created instance");
	}
}
