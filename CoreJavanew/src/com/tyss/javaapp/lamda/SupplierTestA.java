package com.tyss.javaapp.lamda;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class SupplierTestA {
	public static void main(String[] args) {
		Supplier<Gun> s = () -> new Gun(50);

		Gun g = s.get();
		log.info(""+g.bullet);
	}
}
