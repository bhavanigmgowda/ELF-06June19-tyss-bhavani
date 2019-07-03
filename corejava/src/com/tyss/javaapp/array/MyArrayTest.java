package com.tyss.javaapp.array;

import lombok.extern.java.Log;

@Log
public class MyArrayTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MyArrayList m = new MyArrayList();
		int dataSize=15;
		for (int i = 0; i < dataSize; i++) {
			m.add(i);
		}
		log.info("");
		log.info("remove the element");
		m.remove(3);
		for (int j = 0; j < dataSize; j++) {
			log.info("array element= " + m.get(j));
		}
		long endTime = System.currentTimeMillis();

		long durationInNano = (endTime - startTime);
		log.info("time= " + durationInNano);
	}

}
