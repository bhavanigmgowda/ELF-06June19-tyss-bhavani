package com.tyss.javaassessment;


public class TempCustomException extends Exception {
	String msg;
	
	public TempCustomException() {
	}
	
	public TempCustomException(String msg) {
		this.msg = msg;
	}

	public void validateServerRoomTemp(double t) {
		if (t > 35.00) {
			try {
				throw new TempCustomException("Temprature is above 35 deg ");
			} catch (TempCustomException e) {
				e.printStackTrace();
			}
		}
	}
}
