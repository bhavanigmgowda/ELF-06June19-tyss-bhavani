package com.tyss.javaapp.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	
		private static final Logger loger=Logger.getLogger("userlog");
		void connect()
		{
			loger.log(Level.SEVERE,"connect() is called");

			System.out.println(" connect to db");
		}
		void store()
		{
			loger.log(Level.SEVERE,"div()  is called");
			
			System.out.println("store the data");
		}

	}



