package com.tyss.filecreationutilnew.bean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeInfoBean {
	private int id;
	private String name;
	private String email;
	private int phnum;
	private Date JoiningDate;
	private double salary;

}
