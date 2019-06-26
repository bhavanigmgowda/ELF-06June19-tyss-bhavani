package com.tyss.assignment.javafive;

import java.util.Comparator;

public class EmpBySal implements Comparator<ProSixEmp> {

	@Override
	public int compare(ProSixEmp o1, ProSixEmp o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}

}
