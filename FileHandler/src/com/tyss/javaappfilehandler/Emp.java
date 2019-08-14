package com.tyss.javaappfilehandler;

import java.util.Date;

public class Emp {
	private int id;
	private String name;
	private String dept;
	private double sal;
	private int age;
	private Date joingOfDate;
	private String gender;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoingOfDate() {
		return joingOfDate;
	}
	public void setJoingOfDate(Date joingOfDate) {
		this.joingOfDate = joingOfDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", age=" + age
				+ ", joingOfDate=" + joingOfDate + ", gender=" + gender + "]";
	}

}
