package com.tyss.assignment.java5;

import java.util.ArrayList;

/*
 * WAP to store five product bean object into arraylist and display only
 *  the product which has a cost price less than the 2000
 */
public class Pro3Test {
	public static void main(String[] args) {
		ArrayList<Pro3Product> a = new ArrayList<Pro3Product>();
		Pro3Product p1 = new Pro3Product();
		p1.setName("pen");
		p1.setCost(10);
		p1.setRating(4.5);
		Pro3Product p2 = new Pro3Product();
		p2.setName("marker");
		p2.setCost(2200);
		p2.setRating(4.5);
		Pro3Product p3 = new Pro3Product();
		p3.setName("phone");
		p3.setCost(40000);
		p3.setRating(4.5);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (Pro3Product p : a) {
			if (p.getCost() > 2000)
				System.out.println("name=" + p.getName() + " cost=" + p.getCost() + " rating=" + p.getRating());
		}

	}
}
