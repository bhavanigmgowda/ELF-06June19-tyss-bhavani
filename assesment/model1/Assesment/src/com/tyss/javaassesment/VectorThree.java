package com.tyss.javaassesment;

import java.util.Vector;

import lombok.extern.java.Log;
@Log
public class VectorThree extends ListElement {
	@Override
	void getList() {
		Vector<Integer> a=new Vector<Integer>();
		log.info("Vector list element");
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		for(Integer i:a) {
			log.info(""+i);
		}
	}
}
