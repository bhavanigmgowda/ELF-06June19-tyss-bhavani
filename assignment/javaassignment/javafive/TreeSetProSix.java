package com.tyss.assignment.javafive;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetProSix {
	private static final Logger log=Logger.getLogger("bhavani");

	void test(TreeSet<ProSixEmp> t) {

	ProSixEmp e1=new ProSixEmp();
	e1.name="bhavani";
	e1.id=1;
	e1.sal=20000;
	
	ProSixEmp e2=new ProSixEmp();
	e2.name="anjali";
	e2.id=2;
	e2.sal=30000;
	
	ProSixEmp e3=new ProSixEmp();
	e3.name="sahana";
	e3.id=3;
	e3.sal=15000;
	
	ProSixEmp e4=new ProSixEmp();
	e4.name="rashmi";
	e4.id=4;
	e4.sal=50000;

	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	
	for (ProSixEmp e : t) {
		log.info("name=" + e.name+" id=" + e.id+" salary="+e.sal);
	}

}
}
