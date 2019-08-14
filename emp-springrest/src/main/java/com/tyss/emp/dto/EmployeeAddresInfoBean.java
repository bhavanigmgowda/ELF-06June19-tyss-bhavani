package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


//@XmlAccessorType(XmlAccessType.FIELD)

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

	public EmpAddPK getEmpPK() {
		return empPK;
	}

	public void setEmpPK(EmpAddPK empPK) {
		this.empPK = empPK;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	} 	
	
	
	
}
