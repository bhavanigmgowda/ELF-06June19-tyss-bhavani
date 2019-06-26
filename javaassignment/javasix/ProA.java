package com.tyss.assignment.javasix;

import java.util.logging.Logger;

/*
 * WAP to addd num using lamda expression 
 */
public class ProA {
	private static final Logger log=Logger.getLogger("bhavani");

static ProAint s=(a,b)-> a+b;
	public static void main(String[] args) {
		int i=s.add(5,10);
		log.info("addtion= "+i);
		
	}

}
