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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;
@Entity
@Data
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	//Bidirectional mapping, if foreign key is not present
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "otherinfobean")
	private EmployeeOtherInfoBean empotherinfo;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empPK.infoBean")
	private List<EmployeeAddresInfoBean> addressInfobean;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eduPk.infoBean")
	private List<EmployeeEducationInfoBean> eduInfobean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
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
	private Integer id ;
	
	@Column(name="name")
	private String name	;
	
	@Column(name="age")
	private Integer age	;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private Double salary;
	
	@Column(name="phnum")
	private Integer phnum;
	
	@Column(name="joining_date")
	private Date joiningDate;	
	
	@Column(name="account_number")
	private Integer accountNumber;	
	
	@Column(name="email")
	private String email;
	
	@Column(name="designation")
	private String designation;	
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="dept_id")
	private Integer departmentId;	

	@Column(name="password")
	private String password;
			
	@ManyToOne
	@JoinColumn(name="mngr_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;
}
