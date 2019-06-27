package com.tyss.javaapp.set;

import java.util.TreeSet;

public class Pro9TestCar {
	public static void main(String[] args) {
		TreeSet<Car> t=new TreeSet<Car>();
		Car c1=new Car();
		c1.name="abc";
		c1.brand="xyz";
		c1.cost=10000;
		c1.rating=4.5;
		
		Car c2=new Car();
		c2.name="mno";
		c2.brand="wrs";
		c2.cost=20000;
		c2.rating=3.5;
		
		Car c3=new Car();
		c3.name="bca";
		c3.brand="xyz";
		c3.cost=50000;
		c3.rating=5.0;
		
		Car c4=new Car();
		c4.name="ktm";
		c4.brand="tre";
		c4.cost=60000;
		c4.rating=2.5;
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		for(Car c:t) {
			System.out.println("name="+c.name +" brand= "+c.brand+ " cost= "+c.cost +" rate="+c.rating);
		}
		}

}
