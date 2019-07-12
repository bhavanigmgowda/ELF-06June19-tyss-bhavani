package com.techchefs.javaassessment;

import lombok.Data;
@Data
public class Car {
	private String brand;
	private double price;
	private String colour;
	
	public Car(String brand, double price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	
	
}
