package com.tyss.javaapp.lamda;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class SupplierTestB {
	public static void main(String[] args) {
		Supplier<Car> s = () -> new Car(50.5);

		Car g = s.get();
		log.info(""+g.fuel);
	}

}
