package com.tyss.javaapp.implamda;

import lombok.extern.java.Log;

@Log
public class TestGender {
	public static void main(String[] args) {
		Gender t = Gender.FEMALE;
		switch (t) {
		case MALE:log.info("male");
			break;
		case FEMALE:log.info("Female");
			break;
		case OTHER:log.info("other");
			break;
		default:
			break;
		}

	}

}
