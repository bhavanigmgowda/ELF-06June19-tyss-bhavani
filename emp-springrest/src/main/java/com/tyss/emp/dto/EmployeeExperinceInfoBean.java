package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
@Entity
@Table(name="Employee_Experince_Info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperinceInfoBean implements Serializable{
	@EmbeddedId
	private ExpPK empExp;
	private String designation;	
	private Date joinimgDate;	
	private Date leavingDate;
	public ExpPK getEmpExp() {
		return empExp;
	}
	public void setEmpExp(ExpPK empExp) {
		this.empExp = empExp;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoinimgDate() {
		return joinimgDate;
	}
	public void setJoinimgDate(Date joinimgDate) {
		this.joinimgDate = joinimgDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}	
	
}
