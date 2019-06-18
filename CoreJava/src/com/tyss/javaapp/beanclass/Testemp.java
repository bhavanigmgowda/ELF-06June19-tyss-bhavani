package com.tyss.javaapp.beanclass;

public class Testemp {
	public static void main(String[] args) {
		Emp e = new Emp();
		DBE1 d = new DBE1();
		DBE2 d1 = new DBE2();
		e.setId(10);
		e.setName("bhavani");
		e.setGender('f');
		d.pass(e);
		e.setId(20);
		d1.pass(e);

		e.setName("anjali");
		e.setGender('f');
	}
}
