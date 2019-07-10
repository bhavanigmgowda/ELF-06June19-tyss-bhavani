package com.tyss.designpattern.builder;



import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest  {
	public static void main(String[] args) {
		
		MyImmutableClass class1=null;
		class1=new MyImmutableClass("bhavani", 25, 68745345);
		log.info("name="+class1.getName()+"age="+class1.getAge()+"phnum="+class1.getPhone());
		class1=new MyImmutableClass("bhgh", 21, 35785);
		log.info("name="+class1.getName()+"age="+class1.getAge()+"phnum="+class1.getPhone());
		EmployeeData2 data=new EmployeeData2.EmployeeData2Builder()
											.id(10)
											.name("bgh")
											.age(10)
											.gender("f")
											.managerId(1)
											.salary(20000)
											.departmentId(1)
											.accountNumber(3687564)
											.designation("gffgfgf")
											.email("gfgfgf")
											.build();
		log.info(""+data);
		EmployeeData3 data2=new EmployeeData3.EmployeeData3Builder()
				.id(10)
				.name("bhagh")
				.age(10)
				.gender("f")
				.managerId(1)
				.salary(20000)
				.departmentId(1)
				.accountNumber(3687564)
				.designation("gffgfgf")
				.email("gfgfgf")
				.build();
		log.info(""+data2);	
	}
}
