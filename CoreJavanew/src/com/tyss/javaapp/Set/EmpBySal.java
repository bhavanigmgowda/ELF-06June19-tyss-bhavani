package com.tyss.javaapp.Set;

import java.util.Comparator;

public class EmpBySal implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1.sal > o2.sal) {
			return 1;
		} else if (o1.sal < o2.sal) {
			return -1;
		} else {
			return 0;
		}
	}

}
