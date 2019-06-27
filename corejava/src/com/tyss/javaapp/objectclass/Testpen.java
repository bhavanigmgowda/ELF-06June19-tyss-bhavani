package com.tyss.javaapp.objectclass;

public class Testpen {
	public static void main(String[] args) {
		Pen a=new Marker();
		Marker c=(Marker)a;
		c.j=10;
		c.i=(int)c.j;
		c.writemarker();
		c.writepen();
	}
}
