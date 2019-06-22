package com.tyss.assignment.java5;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Pro2Test {

private static final Logger log=Logger.getLogger("bhavani");

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
		Pro2Student p5 = new Pro2Student();
		p5.setName("bharath");
		p5.setId(106);
		p5.setMarks(75);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		
		for (Pro2Student p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
