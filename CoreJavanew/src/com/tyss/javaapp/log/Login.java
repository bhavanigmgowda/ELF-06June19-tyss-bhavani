package com.tyss.javaapp.log;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login {
	
		private static final Logger loger=Logger.getLogger("userlog");
		void validuser()
		{
			loger.log(Level.SEVERE,"validuser() is called");

			System.out.println("valid user");
		}
		void navigate()
		{
			loger.log(Level.SEVERE,"navigate()  is called");
		
			System.out.println("navigate");
		}

	}




