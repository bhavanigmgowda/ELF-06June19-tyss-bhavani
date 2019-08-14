package com.tyss.javaapp.beanclass;

public class Parse {
public static void main(String[] args) {
	String s="2.5";
	String i="2";

	Double d=Double.parseDouble(s);
	int pi=Integer.parseInt(i);
	
	System.out.println(d);
	System.out.println(pi);
}
}
