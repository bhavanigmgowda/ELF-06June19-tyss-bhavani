package com.tyss.assignment.java5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pro9 {

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student e1 = new Student();
		e1.set("bhavani", 20, 60);
		Student e2 = new Student();
		e2.set("anjali", 10, 90);
		a.add(e1);
		a.add(e2);
		HashMap<String, ArrayList<Student>> m = new HashMap<String, ArrayList<Student>>();
		m.put("first", a);
		for (Map.Entry<String, ArrayList<Student>> e : m.entrySet()) {
			String key = e.getKey();
			System.out.println(key);
			ArrayList<Student> ar = e.getValue();
			for (Student el : ar) {
				el.get();
			}

		}
	}
}
