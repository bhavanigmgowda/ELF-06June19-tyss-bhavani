package com.tyss.javaapp.array;

import java.util.Arrays;

public class TestEmp {
	public static void main(String[] args) {
		Emp e[] = new Emp[3];
		Emp e1 = new Emp();
		e1.setId(10);
		e1.setName("bhavani");
		e1.setSal(2000);
		e[0] = e1;

		Emp e2 = new Emp();
		e2.setId(20);
		e2.setName("vani");
		e2.setSal(3000);
		e[1] = e2;

		Emp e3 = new Emp();
		e3.setId(30);
		e3.setName("anjali");
		e3.setSal(6000);
		e[2] = e3;
		
		Arrays.sort(e);
		for (Emp i : e) {
			System.out.println("**********************");
			System.out.println("id:" + i.getId());
			System.out.println("name:" + i.getName());
			System.out.println("salary:" + i.getSal());

		}

	}

}
