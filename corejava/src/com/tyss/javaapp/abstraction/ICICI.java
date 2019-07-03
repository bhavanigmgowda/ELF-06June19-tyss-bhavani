package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ICICI implements ATMcard {	private static final Logger loger = Logger.getLogger("google");

public void validate() {
	loger.log(Level.SEVERE," validating the ICICI");
	
}
public void getinfo() {
	loger.log(Level.SEVERE,"geting ICICI info ");
}
}
