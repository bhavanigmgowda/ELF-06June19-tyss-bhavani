package com.tyss.javaapp.beanclass;

public class Testperson {
	public static void main(String[] args) {
		DB1 d = new DB1();
		DB2 d1 = new DB2();

		Person p = new Person();
		p.setname("bhavani");
		p.setage(10);
		d.pass(p);
		d1.pass(p);

	}
}
