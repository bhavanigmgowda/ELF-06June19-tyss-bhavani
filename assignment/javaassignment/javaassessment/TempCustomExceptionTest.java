package com.tyss.javaassessment;
/*24)	WAP to create a custom exception to validate the temperature of the server room. (Eg: If the temperature is more that 18 degrees, there should be an exception)*/
public class TempCustomExceptionTest {

	public static void main(String[] args) {
		double temp=25.00;
		TempCustomException c =new TempCustomException();
		c.validateServerRoomTemp(temp);
	}

}
