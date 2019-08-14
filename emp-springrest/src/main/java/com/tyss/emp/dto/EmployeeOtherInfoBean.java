package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="employee_other_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean  implements Serializable{
	@JsonIgnore
	@OneToOne
	@Id
	@JoinColumn(name = "id")
	private EmployeeInfoBean otherinfobean;
	
	@Column(name="pan")
	private Integer pan;						
	
	@Column(name="ismarried")
	private String isMarried;					
	
	@Column(name="blood_group")
	private String bloodGroup;				
	
	@Column(name="ischallenged")
	private String isChallenged;				
	
	@Column(name=" emergency_contact_number ")
	private Integer emergencyContactNumber;	
	
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
	private Integer passport;					
	
	@Column(name="adhar")
	private Integer adhar;

	public EmployeeInfoBean getOtherinfobean() {
		return otherinfobean;
	}

	public void setOtherinfobean(EmployeeInfoBean otherinfobean) {
		this.otherinfobean = otherinfobean;
	}

	public Integer getPan() {
		return pan;
	}

	public void setPan(Integer pan) {
		this.pan = pan;
	}

	public String getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(String isMarried) {
		this.isMarried = isMarried;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getIsChallenged() {
		return isChallenged;
	}

	public void setIsChallenged(String isChallenged) {
		this.isChallenged = isChallenged;
	}

	public Integer getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(Integer emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherNm() {
		return fatherNm;
	}

	public void setFatherNm(String fatherNm) {
		this.fatherNm = fatherNm;
	}

	public String getMotherNm() {
		return motherNm;
	}

	public void setMotherNm(String motherNm) {
		this.motherNm = motherNm;
	}

	public String getSpouseNm() {
		return spouseNm;
	}

	public void setSpouseNm(String spouseNm) {
		this.spouseNm = spouseNm;
	}

	public String getHusbandNm() {
		return husbandNm;
	}

	public void setHusbandNm(String husbandNm) {
		this.husbandNm = husbandNm;
	}

	public Integer getPassport() {
		return passport;
	}

	public void setPassport(Integer passport) {
		this.passport = passport;
	}

	public Integer getAdhar() {
		return adhar;
	}

	public void setAdhar(Integer adhar) {
		this.adhar = adhar;
	}
	
	
	}						


