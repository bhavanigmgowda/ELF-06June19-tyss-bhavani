package com.tyss.javaassessment;
/*2)	WAP for a method which returns KurKure, Lays, Bingo… based on the option entered*/
import lombok.extern.java.Log;

@Log
public class ProgramThree {

	public static void main(String[] args) {
		int choice = 2;
		log.info("Get snacks " + getSnacks(choice));
	}

	public static String getSnacks(int option) {
		switch (option) {
		case 1:
			return "Kurkure";

		case 2:
			return "Lays";

		case 3:
			return "Bingo";
		default:
			return "Enter the valid option";
		}

	}

}
