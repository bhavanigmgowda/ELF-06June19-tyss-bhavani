package com.tyss.javaapp.implamda;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class ExceTest {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		try {
		
		}catch (NullPointerException | ArithmeticException e1) {
			log.info(""+e1.getMessage());
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
