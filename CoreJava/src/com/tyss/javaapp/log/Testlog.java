package com.tyss.javaapp.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Testlog {
	private static final Logger loger=Logger.getLogger("Bhavani");
	public static void main(String[] args) {
	LogManager.getLogManager().reset();
		loger.setLevel(Level.SEVERE);
		
		try {
			FileHandler fh = new FileHandler("myFevLog.log",true);
			
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			loger.log(Level.SEVERE,"*************");
			loger.log(Level.SEVERE,"Hi its SEVERE a message");
			loger.log(Level.WARNING,"Hi its WARNING a message");
			loger.log(Level.INFO,"Hi its INFO a message");
			loger.log(Level.CONFIG,"Hi its CONFIG a message");
			loger.log(Level.FINE,"Hi its FINE a message");
			loger.log(Level.FINER,"Hi its FINER a message");
			loger.log(Level.FINEST,"Hi its FINEST a message");
			
			BuyFlip by=new BuyFlip();
			by.buy();
			System.out.println("done");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
	}
