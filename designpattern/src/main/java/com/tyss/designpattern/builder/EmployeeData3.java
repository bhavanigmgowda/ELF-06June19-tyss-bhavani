package com.tyss.designpattern.builder;

import java.io.Serializable;

import lombok.Builder;
import lombok.ToString;
@Builder
@ToString
public final class EmployeeData3 implements Serializable{
	
	private int id ;
	private String name	;
	private int age	;
	private String gender;
	private double salary;
	private long accountNumber;	
	private String email;
	private String designation;	
	private int departmentId;	
	private int managerId;

}
