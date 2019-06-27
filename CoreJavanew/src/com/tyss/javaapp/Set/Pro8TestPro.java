package com.tyss.javaapp.set;

import java.util.TreeSet;

public class Pro8TestPro {
public static void main(String[] args) {
	TreeSet<Product> t=new TreeSet<Product>();
	Product p1=new Product();
	p1.name="brush";
	p1.cost=50;
	p1.rate=3.5;
	
	Product p2=new Product();
	p2.name="pen";
	p2.cost=10;
	p2.rate=2.5;
	
	Product p3=new Product();
	p3.name="marker";
	p3.cost=40;
	p3.rate=5.0;
	
	Product p4=new Product();
	p4.name="soap";
	p4.cost=60;
	p4.rate=1.4;
	t.add(p1);
	t.add(p2);
	t.add(p3);
	t.add(p4);
	for(Product p:t)
	{
		System.out.println("name="+p.name +" cost= "+p.cost +" rate="+p.rate);
	}
}
}
