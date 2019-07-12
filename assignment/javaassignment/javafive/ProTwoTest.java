package com.tyss.assignment.javafive;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ProTwoTest {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<ProTwoStudent> a = new ArrayList<ProTwoStudent>();
		ProTwoStudent p1 = new ProTwoStudent();
		p1.setName("bhavani");
		p1.setId(101);
		p1.setMarks(70);
		ProTwoStudent p4 = new ProTwoStudent();
		p4.setName("sahana");
		p4.setId(104);
		p4.setMarks(70);
		ProTwoStudent p2 = new ProTwoStudent();
		p2.setName("anjali");
		p2.setId(102);
		p2.setMarks(80);
		ProTwoStudent p3 = new ProTwoStudent();
		p3.setName("sahana");
		p3.setId(103);
		p3.setMarks(60);

		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (ProTwoStudent p : a) {
			log.info("name=" + p.getName() + " ID=" + p.getId() + " marks=" + p.getMarks());
		}

	}
}
