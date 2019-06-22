package com.tyss.javaapp.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal {
	private static final Logger loger=Logger.getLogger("Animallog");
	void sound()
	{
		loger.log(Level.SEVERE,"sound() of cow is called");

		System.out.println("amba amba");
		
	}
	void div(int a,int b)
	{
		loger.log(Level.SEVERE,"div()of cow is called");

		System.out.println(a/b);
	}

}

