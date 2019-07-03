package com.tyss.assignment.javaseven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ProH {
	private static final Logger log = Logger.getLogger("bhavani");


	public static void main(String[] args) {
		Emp emp1=new Emp("bhavani", 6, 2,"software engg"); 
		Emp emp2=new Emp("anjali", 1, 4,"HR"); 
		Emp emp3=new Emp("sahana", 3, 1,"testing"); 
		Emp emp4=new Emp("vani", 2, 3,"software engg"); 
		Emp emp5=new Emp("bavana", 4, 2,"IT"); 
		ArrayList<Emp> t = new ArrayList<Emp>();
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		t.add(emp5);

		Predicate<Emp> x1 = i -> 	 i.exp >=2&& i.job=="software engg";
		
		List<Emp> x = t.stream().filter(x1).collect(Collectors.toList());
		for(Emp s:x) {
			log.info(""+s);

		
	}
}
}