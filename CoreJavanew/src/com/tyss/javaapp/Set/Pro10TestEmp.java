package com.tyss.javaapp.set;

import java.util.TreeSet;

public class Pro10TestEmp {
	public static void main(String[] args) {
		
		EmpById r=new EmpById();
		EmpBySal s=new EmpBySal();
		EmpByName n=new EmpByName();
		TreeSet<Emp> t=new TreeSet<Emp>(n);
		Emp e1=new Emp();
		e1.name="bhavani";
		e1.id=1;
		e1.sal=20000;
		
		Emp e2=new Emp();
		e2.name="anjali";
		e2.id=2;
		e2.sal=30000;
		
		Emp e3=new Emp();
		e3.name="sahana";
		e3.id=3;
		e3.sal=15000;
		
		Emp e4=new Emp();
		e4.name="rashmi";
		e4.id=4;
		e4.sal=50000;
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		for (Emp e : t) {
			System.out.println("name=" + e.name+" id=" + e.id+" salary="+e.sal);
		}
		
	}

}
