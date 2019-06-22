package com.tyss.assignment.java5;

import java.util.Comparator;

public class EmpById implements Comparator<Pro6Emp> {

	@Override
	public int compare(Pro6Emp o1, Pro6Emp o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}