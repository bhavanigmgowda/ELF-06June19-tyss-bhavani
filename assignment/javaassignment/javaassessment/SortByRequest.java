package com.tyss.javaassessment;

import java.util.Comparator;

public class SortByRequest {

	Comparator<Student> c;

	// sort by role number
	Comparator<Student> sortByRoleNumber() {
		c = (s1, s2) -> {
			if (s1.getRoleNumber() > s2.getRoleNumber()) {
				return 1;
			} else if (s1.getRoleNumber() < s2.getRoleNumber()) {
				return -1;
			} else {
				return 0;
			}
		};
		return c;
	}

	// sort by name
	Comparator<Student> sortByName() {
		c = (s1, s2) -> s1.getName().compareTo(s2.getName());

		return c;
	}

	// sort by percentage
	Comparator<Student> sortByPercentage() {
		c = (s1, s2) -> {
			if (s1.getPercentage() > s2.getPercentage()) {
				return 1;
			} else if (s1.getPercentage() < s2.getPercentage()) {
				return -1;
			} else {
				return 0;
			}
		};
		return c;
	}
}
