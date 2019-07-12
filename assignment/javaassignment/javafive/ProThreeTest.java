package com.tyss.assignment.javafive;

import java.util.ArrayList;
import java.util.logging.Logger;

/*
 * WAP to store five product bean object into arraylist and display only
 *  the product which has a cost price less than the 2000
 */
public class ProThreeTest {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<ProThreeProduct> a = new ArrayList<ProThreeProduct>();
		ProThreeProduct p1 = new ProThreeProduct();
		p1.setName("pen");
		p1.setCost(10);
		p1.setRating(4.5);
		ProThreeProduct p2 = new ProThreeProduct();
		p2.setName("marker");
		p2.setCost(2200);
		p2.setRating(4.5);
		ProThreeProduct p3 = new ProThreeProduct();
		p3.setName("phone");
		p3.setCost(40000);
		p3.setRating(4.5);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		for (ProThreeProduct p : a) {
			if (p.getCost() > 2000)
				log.info("name=" + p.getName() + " cost=" + p.getCost() + " rating=" + p.getRating());
		}

	}
}
