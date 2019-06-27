package com.tyss.javaapp.beanclass;

import java.util.logging.Logger;

public class Parse {
	private static final Logger loger = Logger.getLogger("google");

public static void main(String[] args) {
	String s="2.5";
	String i="2";

	Double d=Double.parseDouble(s);
	int pi=Integer.parseInt(i);
	
	System.out.println(d);
	System.out.println(pi);
}
}
