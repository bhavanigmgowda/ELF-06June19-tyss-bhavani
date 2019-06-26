package com.tyss.assignment.javafive;

import java.util.Comparator;

public class EmpByName implements Comparator<ProSixEmp> {

	@Override
	public int compare(ProSixEmp o1, ProSixEmp o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
