package com.tyss.javaassessment;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class SupplierFuncInterfacePenObject {

	public static void main(String[] args) {
		Supplier<Pen> s=()->new Pen();
		
		log.info(""+s.get().getClass());
	}

}
