package com.tyss.javaassessment;

public class Student {
	int roleNumber;
	String name;
	double percentage;
	String gender;

	public Student(int roleNumber, String name, Double percentage,String gender) {
		this.roleNumber = roleNumber;
		this.name = name;
		this.percentage = percentage;
		this.gender=gender;
	}

	public int getRoleNumber() {
		return this.roleNumber;
	}

	public String getName() {
		return this.name;
	}

	public double getPercentage() {
		return this.percentage;
	}
	
	public String getGender() {
		return this.gender;
	}

	@Override
	public String toString() {
		return "Student [roleNumber=" + roleNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
