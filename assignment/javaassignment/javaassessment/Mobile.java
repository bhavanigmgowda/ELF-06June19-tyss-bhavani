package com.tyss.javaassessment;

import java.io.Serializable;

public class Mobile implements Serializable {
	private String brand;
	private double price;
	private String colour;

	public Mobile() {
	}

	public Mobile(String brand, double price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}

}
