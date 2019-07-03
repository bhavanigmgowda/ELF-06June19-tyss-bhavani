package com.tyss.javaapp.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pro1HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<>();
		h.put("one", 1);
		h.put("two", 20);
		h.put("three", 30);
		h.put("four", 60);
		for(Entry<String, Integer> a: h.entrySet())
			System.out.println(a);
	}

}
