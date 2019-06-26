package com.tyss.assignment.javafive;

import java.util.Comparator;

public class EmpById implements Comparator<ProSixEmp> {

	@Override
	public int compare(ProSixEmp o1, ProSixEmp o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}