package com.tyss.javaassesment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ArrayListOne extends ListElement {
	@Override
	void getList() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		log.info("array list element");
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		for (Integer i : a) {
			log.info("" + i);
		}

	}

}
