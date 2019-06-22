package com.tyss.javaapp.objectclass;

public class Testanimal {
public static void main(String[] args) {
	Animal a=new Cow();
	Cow c=(Cow)a;
	c.i=10;
	c.j=20;
	c.run();
	c.eat();
}
}
