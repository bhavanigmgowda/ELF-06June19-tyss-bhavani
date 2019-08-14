package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfoBean  implements Serializable{
	
	@OneToOne
	@Id
	@JoinColumn(name = "id")
	private EmployeeInfoBean otherinfobean;
	
	@Column(name="pan")
	private int pan;						
	
	@Column(name="ismarried")
	private String isMarried;					
	
	@Column(name="blood_group")
	private String bloodGroup;				
	
	@Column(name="ischallenged")
	private String isChallenged;				
	
	@Column(name=" emergency_contact_number ")
	private int emergencyContactNumber;	
	
	@Column(name="emergency_contact_name")
	private String emergencyContactName;	
	
	@Column(name="nationality")
	private String nationality;				
	
	@Column(name="religion")
	private String religion;					
	
	@Column(name="father_nm")
	private String fatherNm;					
	
	@Column(name="mother_nm")
	private String motherNm;					
	
	@Column(name="spouse_nm")
	private String spouseNm;					
	
	@Column(name="husband_nm")
	private String husbandNm;				
	
	@Column(name="passport")
	private int passport;					
	
	@Column(name="adhar")
	private int adhar;
	
	}						


