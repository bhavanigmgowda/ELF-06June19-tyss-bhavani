package com.tyss.assignment.java5;

import java.util.Comparator;

public class EmpBySal implements Comparator<Pro6Emp> {

	@Override
	public int compare(Pro6Emp o1, Pro6Emp o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}

}
