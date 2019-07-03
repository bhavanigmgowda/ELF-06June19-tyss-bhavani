package com.tyss.javaapp.objectclass;

public class Test {
public static void main(String[] args) {
	 Student s1=new Student("bhavani", 123, 4.5);

	 Student s2=new Student("bhavani", 123, 4);
	 System.out.println(s1.equals(s2));
}
}
