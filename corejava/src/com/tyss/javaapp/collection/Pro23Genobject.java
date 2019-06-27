package com.tyss.javaapp.collection;

import java.util.ArrayList;

public class Pro23Genobject {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student s1 = new Student();
		s1.set("bhavani", 123, 70);
		Student s2 = new Student();
		s2.set("vani", 321, 80);
		Student s3 = new Student();
		s3.set("sahana", 456, 60);
		a.add(s1);
		a.add(s2);
		a.add(s3);

		for (int i = 0; i < a.size(); i++) {
			Student s = a.get(i);
			System.out.println("name=" + s.name);
			System.out.println("id=" + s.id);
			System.out.println("per=" + s.per);
		}

	}

}
