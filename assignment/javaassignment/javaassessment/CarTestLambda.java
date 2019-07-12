package com.tyss.javaassessment;
/*10)	WAP to display only the cars that belongs to respective brand. (Using Lambda and Stream)*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class CarTestLambda {
	public static void main(String[] args) {
		ArrayList<Car> cars=new ArrayList<Car>();
		cars.add(new Car("Suzuki",300000,"White"));
		cars.add(new Car("Honda",1200000,"Black"));
		cars.add(new Car("Toyota",2300000,"White"));
		cars.add(new Car("Suzuki",6700000,"White"));
		
		List<Car> l=cars.stream().filter(i->i.getBrand().equals("Suzuki")).collect(Collectors.toList());
		for (Car car : l) {
			log.info(car.getBrand());
			log.info(""+car.getPrice());
			log.info(car.getColour());
		}

	}
}
