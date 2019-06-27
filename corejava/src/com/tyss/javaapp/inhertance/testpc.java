package com.tyss.javaapp.inhertance;

public class testpc {
	public static void main(String[] args) {
	 Pen p=	new Marker();
	 System.out.println(p.cost);
	 p.write();
	 /*we can't access member of child class with the parent ref var */
	 
	 
	 
	 Marker m=(Marker)p;
	 m.color();
	 
	}

}
