package com.tyss.assignment.java5;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetPro6 {
	private static final Logger log=Logger.getLogger("bhavani");

	void test(TreeSet<Pro6Emp> t) {

	Pro6Emp e1=new Pro6Emp();
	e1.name="bhavani";
	e1.id=1;
	e1.sal=20000;
	
	Pro6Emp e2=new Pro6Emp();
	e2.name="anjali";
	e2.id=2;
	e2.sal=30000;
	
	Pro6Emp e3=new Pro6Emp();
	e3.name="sahana";
	e3.id=3;
	e3.sal=15000;
	
	Pro6Emp e4=new Pro6Emp();
	e4.name="rashmi";
	e4.id=4;
	e4.sal=50000;

	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	
	for (Pro6Emp e : t) {
		log.info("name=" + e.name+" id=" + e.id+" salary="+e.sal);
	}

}
}
