package com.tyss.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


import lombok.extern.java.Log;
@Log
public class TestA {
	public static void main(String[] args) {
		LocalDateTime a1=LocalDateTime.of(1996, 12, 18, 11, 38);
		
		LocalTime t=LocalTime.now();
		
		LocalDate date=LocalDate.of(1996, 12, 18);
		
		LocalTime t1=LocalTime.now();
		
		LocalTime time=LocalTime.of(9, 30);
		
		log.info("date and time= "+a1);
		log.info("date "+date);
		log.info("time "+time);
		
		log.info("current day month="+a1.getDayOfMonth()); //current day month
		log.info("current day of week"+a1.getDayOfWeek()); //current day of week
		log.info(""+a1.getDayOfMonth()); //current day
		log.info(""+a1.plusYears(28));
		log.info(""+a1.plusMonths(4));
		log.info(""+LocalDate.of(1996, 12, 18));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		log.info(""+a1.format(dtf));
		
	}

}
