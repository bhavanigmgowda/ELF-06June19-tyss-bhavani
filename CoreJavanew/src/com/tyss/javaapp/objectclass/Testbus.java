package com.tyss.javaapp.objectclass;

public class Testbus {
	public static void main(String[] args) {
		Bus a=new Van();
		Van c=(Van)a;
		c.model=10;
		c.seats=20;
		c.move();
		c.turn();
	}

}
