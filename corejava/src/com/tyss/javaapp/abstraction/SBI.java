package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SBI implements ATMcard {
	private static final Logger loger = Logger.getLogger("google");

	public void validate() {
		loger.log(Level.SEVERE, " validating the SBI");

	}

	public void getinfo() {
		loger.log(Level.SEVERE, "geting SBI info ");
	}
}
