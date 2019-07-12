package com.tyss.javaassessment;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*21)	WAP to sort the students by role number, name and percentage based on the user request.*/
import lombok.extern.java.Log;

@Log
public class StudentSortTest {

	public static void main(String[] args) {

		Student s1 = new Student(2, "John", 30.00,"male");
		Student s2 = new Student(9, "Abhay", 75.50,"male");
		Student s3 = new Student(1, "Ria", 60.00,"female");
		Student s4 = new Student(7, "Yogesh", 87.00,"male");
		Student s5 = new Student(5, "Leena", 48.00,"Female");

		TreeSet<Student> ts = null;

		SortByRequest req = new SortByRequest();

		String choice = "PERC";

		switch (choice) {
		case "ROLE":
			ts = new TreeSet<>(req.sortByRoleNumber());
			break;
		case "NAME":
			ts = new TreeSet<>(req.sortByName());
			break;
		case "PERC":
			ts = new TreeSet<>(req.sortByPercentage());
			break;
		default:
			log.info("Wrong Choice");
		}
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student student : ts) {
			log.info("" + student);
		}

	}
}
