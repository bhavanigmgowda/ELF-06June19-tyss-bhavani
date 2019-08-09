package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="Employee_Addres_Info")
public class EmployeeAddresInfoBean implements Serializable {
	@EmbeddedId
	private EmpAddPK empPK;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	 private String address2;
	
	@Column(name="landmark")
	 private String landmark;
	
	@Column(name="city")
	 private String city; 	
	
	@Column(name="state")
	 private String state; 
	
	@Column(name="pincode")
	 private Integer pincode; 	
	
	@Column(name="country")
	 private Integer country; 	
	
	
	
}
