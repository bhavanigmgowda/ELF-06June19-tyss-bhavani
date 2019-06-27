package com.tyss.javaapp.collection;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class Pro1AddArrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add('c');
		a.add("bhavani");
		a.add(4.6);
		a.add(50);
		a.add(7.96);
		for (int i = 0; i < a.size(); i++) {
			Object o = a.get(i);
			log.info("" + o);
		}

	}

}
