package com.tyss.javaapp.implamda;
import lombok.extern.java.Log;
@Log
public class TestLoan {
	public static void main(String[] args) {
		Loan l=Loan.CAR;
		
		int cons=l.getValue();
		log.info("value "+cons);
		
	}
}
