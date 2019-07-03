package com.tyss.assignment.javaseven;

import java.util.Comparator;
import java.util.TreeSet;

public class ProB {
	public static void main(String[] args) {
		Product p1 = new Product("pen", 6, 8.9);
		Product p2 = new Product("marker", 10, 5.9);
		Product p3 = new Product("notes", 15, 3.9);
		Product p4 = new Product("sweet", 25, 6.9);
		Product p5 = new Product("mobile", 20000, 8.9);

		Comparator<Product> sortName = (i, j) -> i.name.compareTo(j.name);
		Comparator<Product> sortCost = (i, j) -> {
			Integer a = i.cost;
			Integer b = j.cost;
			return a.compareTo(b);
		};
		Comparator<Product> sortRating = (i, j) -> {
			Double a = i.rating;
			Double b = j.rating;
			return a.compareTo(b);
		};
		TreeSet<Product> t = new TreeSet<Product>(sortName);
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		for (Product el : t) {
			el.get();
		}

	}

}
