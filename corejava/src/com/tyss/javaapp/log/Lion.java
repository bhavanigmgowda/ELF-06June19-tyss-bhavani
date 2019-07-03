package com.tyss.javaapp.log;

import java.util.logging.Level;
import java.util.logging.Logger;

class Lion extends Animal
{
	private static final Logger loger=Logger.getLogger("Animallog");
	void sound()
	{
		loger.log(Level.SEVERE,"sound() of lion is called");

		System.out.println("lion sound");
		
	}
	void div(int a,int b)
	{
		loger.log(Level.SEVERE,"div() of lion is called");

		System.out.println(a/b);
	}

}