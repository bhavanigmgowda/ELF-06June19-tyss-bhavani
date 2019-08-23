package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.Data;
@Entity
@Data
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	//Bidirectional mapping, if foreign key is not present
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "otherinfobean")
	private EmployeeOtherInfoBean empotherinfo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPK.infoBean")
	private List<EmployeeAddresInfoBean> addressInfobean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eduPk.infoBean")
	private List<EmployeeEducationInfoBean> eduInfobean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExp.infoBean")
	private List<EmployeeExperinceInfoBean> expInfobean;

	/*
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans") private
	 * List<TrainingInfoBean> trainbean;
	 */


	
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn                                                                                                                                    
	private EmployeeOtherInfoBean otherInfo;
	@Id
	@Column(name="id")
	private int id ;
	@Column(name="name")
	private String name	;
	@Column(name="age")
	private int age	;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="phnum")
	private int phnum;
	@Column(name="joining_date")
	private Date joiningDate;	
	@Column(name="account_number")
	private int accountNumber;	
	@Column(name="email")
	private String email;
	@Column(name="designation")
	private String designation;	
	@Column(name="dob")
	private Date dob;
	@Column(name="dept_id")
	private int departmentId;	

	@Column(name="password")
	private String password;
			
	@ManyToOne
	@JoinColumn(name="mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;



}
