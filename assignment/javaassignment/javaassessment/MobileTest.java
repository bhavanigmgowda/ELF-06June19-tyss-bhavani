package com.tyss.javaassessment;
/*28)	WAP to store the mobile objects into array list and pass the list to other method, 
 * which is designed to display the details of the mobile.
 *  (Mobile should be a bean class)*/
import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class MobileTest {

	public static void main(String[] args) {
		ArrayList<Mobile> mobiles=new ArrayList<Mobile>();
		mobiles.add(new Mobile("Samsung", 10000.00, "White"));
		mobiles.add(new Mobile("Lenovo", 12000.00, "Golden"));
		mobiles.add(new Mobile("LG", 22000.00, "Black"));
		
		showMobileDetails(mobiles);
		
	}
	public static void showMobileDetails(ArrayList<Mobile> list) {
		for (Mobile mobile : list) {
			log.info("Brand : "+mobile.getBrand());
			log.info("Price"+mobile.getPrice());
			log.info("Colour"+mobile.getColour());
			log.info("************************");
		}
	}

}
