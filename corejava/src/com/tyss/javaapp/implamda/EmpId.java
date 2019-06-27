package com.tyss.javaapp.implamda;

import java.util.Comparator;

public class EmpId implements Comparator<Emp>{

		@Override
		public int compare(Emp o1, Emp o2) {
			if (o1.id > o2.id) {
				return 1;
			} else if (o1.id < o2.id) {
				return -1;
			} else {
				return 0;
			}
		}

	}

