package com.tyss.javaapp.implamda;
import java.util.logging.Logger;

import lombok.extern.java.Log;
@Log
public class TestLoan {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Loan l=Loan.CAR;
		
		int cons=l.getValue();
		log.info("value "+cons);
		
	}
}
