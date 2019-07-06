package com.tyss.designpattern;


import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest  {
	public static void main(String[] args) {
		
		MyImmutableClass class1=null;
		class1=new MyImmutableClass("bhavani", 25, 68745345);
		log.info("name="+class1.getName()+"age="+class1.getAge()+"phnum="+class1.getPhone());

		class1=new MyImmutableClass("bhgh", 21, 35785);
		
		log.info("name="+class1.getName()+"age="+class1.getAge()+"phnum="+class1.getPhone());
	}
}
