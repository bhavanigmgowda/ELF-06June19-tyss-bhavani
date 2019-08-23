package com.tyss.javaapp.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyFlip {
	private static final Logger loger=Logger.getLogger("Bhavani");
	void buy()
	{
		loger.log(Level.SEVERE,"Hi its  Buy SEVERE a message");
		loger.log(Level.WARNING,"Hi its buy WARNING a message");
	}

}
