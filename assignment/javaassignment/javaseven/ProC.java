package com.tyss.assignment.javaseven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ProC {
	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.set("bhavani", 18, 67);
		s2.set("ANJALI", 21, 77);
		s3.set("sahana", 21, 87);
		s4.set("vani", 22, 34);
		ArrayList<Student> t = new ArrayList<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		Predicate<Student> x1 = i -> i.marks < 35;
		List<Student> x = t.stream().filter(x1).collect(Collectors.toList());
		for(Student s:x) {
			log.info(""+s);
		}
	}
}
