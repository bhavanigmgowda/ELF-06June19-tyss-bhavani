package com.tyss.assignment.java5;

import java.util.ArrayList;

public class Pro2Test {
	public static void main(String[] args) {
		ArrayList<Pro2Student> a = new ArrayList<Pro2Student>();
		Pro2Student p1 = new Pro2Student();
		p1.setName("bhavani");
		p1.setId(101);
		p1.setMarks(70);
		Pro2Student p4 = new Pro2Student();
		p4.setName("sahana");
		p4.setId(104);
		p4.setMarks(70);
		Pro2Student p2 = new Pro2Student();
		p2.setName("anjali");
		p2.setId(102);
		p2.setMarks(80);
		Pro2Student p3 = new Pro2Student();
		p3.setName("sahana");
		p3.setId(103);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Pro2Student p : a) {
			System.out.println("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
