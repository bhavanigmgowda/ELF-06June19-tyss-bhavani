package com.tyss.assignment.javaseven;

import java.util.logging.Logger;

public class Product {
	private static final Logger log=Logger.getLogger("bhavani");

	String name;
	 int cost;
	 double rating;
	public Product(String name, int cost, double rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}


	void get() {
		log.info("name= "+name+"cost= "+cost+"rating= "+rating);
	}

}
