package com.tyss.assignment.java5;

import java.util.Comparator;

public class EmpByName implements Comparator<Pro6Emp> {

	@Override
	public int compare(Pro6Emp o1, Pro6Emp o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
