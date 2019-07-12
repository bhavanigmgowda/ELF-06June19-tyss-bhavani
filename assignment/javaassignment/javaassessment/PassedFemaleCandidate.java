package com.tyss.javaassessment;

/*7)	WAP to find the count of only passed female candidates of the class. (Using Lambda and Stream)*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class PassedFemaleCandidate {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(2, "John", 30.00, "male"));
		arrayList.add(new Student(9, "Abhay", 75.50, "male"));
		arrayList.add(new Student(1, "Ria", 60.00, "female"));
		arrayList.add(new Student(7, "Yogesh", 87.00, "male"));
		arrayList.add(new Student(5, "Leena", 20.00, "Female"));

		List<Student> list = arrayList.stream()
				.filter(i -> i.getPercentage() > 35 && i.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
		list.stream().forEach(stu -> log.info("" + stu));

	}
}
