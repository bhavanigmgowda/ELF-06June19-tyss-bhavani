package com.tyss.javaassesment;

import java.util.LinkedList;

import lombok.extern.java.Log;
@Log
public class LinkedListTwo extends ListElement {
	@Override
	void getList() {
		LinkedList<Integer> a=new LinkedList<Integer>();
		log.info("LinkedList list element");
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		for(Integer i:a) {
			log.info(""+i);
		}
		
	}

}
