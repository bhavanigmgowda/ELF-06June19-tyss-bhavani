package com.tyss.javaapp.log;
	import java.util.logging.FileHandler;
	import java.util.logging.Level;
	import java.util.logging.LogManager;
	import java.util.logging.Logger;
	import java.util.logging.SimpleFormatter;

public class Testloguser {
		private static final Logger loger = Logger.getLogger("userlog");

		public static void main(String[] args) {
			LogManager.getLogManager().reset();
			loger.setLevel(Level.SEVERE);

			try {
				FileHandler fh = new FileHandler("myFevLoguser.log", true);
				fh.setLevel(Level.ALL);
				fh.setFormatter(new SimpleFormatter());
				loger.addHandler(fh);
				Register r=new Register();
				r.connect();
				r.store();
				Login l=new Login();
				l.validuser();
				l.navigate();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}


