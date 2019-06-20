package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro25TestStud2 {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student s1 = new Student();
		s1.set("Divya", 1, 78.98);
		Student s2 = new Student();
		s2.set("priya", 3, 69.87);
		Student s3 = new Student();
		s3.set("anil", 4, 62);
		Student s4 = new Student();
		s4.set("manu", 2, 88.97);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		Iterator<Student> it = a.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("name=" + s.name);
			System.out.println("id=" + s.id);
			System.out.println("per=" + s.per);
		}

	}

}
