package com.tyss.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ProStudent {

	static Comparator<Student> c = (i, j) -> {
		Double d = i.per;
		Double b = j.per;
		return d.compareTo(b);
	};

	static Student getTopper(ArrayList<Student> s) {
		return s.stream().max(c).get();
	}

	static Student getLowest(ArrayList<Student> s) {
		return s.stream().min(c).get();
	}

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		Student s1 = new Student();
		s1.set("anjali", 123, 80);
		Student s2 = new Student();
		s2.set("bhavani", 789, 70);
		Student s3 = new Student();
		s3.set("rashmi", 123, 60);
		Student s4 = new Student();
		s4.set("sahana", 123, 40);

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		Stream<ArrayList<Student>> s=Stream.of(a);
		
		Student maxValue = getTopper(a);
		log.info("name= " + maxValue.name + " marks=" + maxValue.per);
		Student minValue = getLowest(a);
		log.info("name= " + minValue.name + " marks=" + minValue.per);
	}

}
