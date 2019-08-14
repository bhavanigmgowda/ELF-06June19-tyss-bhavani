package com.tyss.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import lombok.extern.java.Log;
@Log
public class TestPeriod {
public static void main(String[] args) {
	LocalDate a2=LocalDate.now();
	LocalDate a3=LocalDate.of(1996, 12, 18);
	
	LocalDate a4=a3.plusDays(60);
	
	log.info(""+Period.between(a2, a3));
	
	
	log.info("dead"+Period.between(a4, a3));
	
	ZoneId z=ZoneId.systemDefault();
	log.info(""+z);
	
	ZoneId z1=ZoneId.of("Australia/Sydney");
	log.info(""+z1);
	
	

}
}
