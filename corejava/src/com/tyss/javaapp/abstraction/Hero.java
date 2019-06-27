package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hero extends Honda{
	private static final Logger loger = Logger.getLogger("google");
	void design()
	{
		loger.log(Level.SEVERE,"i am design");
	}
	
}
