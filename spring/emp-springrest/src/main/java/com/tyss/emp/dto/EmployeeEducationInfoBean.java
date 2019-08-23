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
@Table(name="Employee_Education_Info")
//@XmlAccessorType(XmlAccessType.FIELD)

public class EmployeeEducationInfoBean  implements Serializable {
	@EmbeddedId
	private EducationEmbBean eduPk;
	private String degreeType	;
	private String branch	;		
	private String collageNm;		
	private String university;		
	private Date yop	;		
	private Double percentage;		
	private String location	;
	public EducationEmbBean getEduPk() {
		return eduPk;
	}
	public void setEduPk(EducationEmbBean eduPk) {
		this.eduPk = eduPk;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollageNm() {
		return collageNm;
	}
	public void setCollageNm(String collageNm) {
		this.collageNm = collageNm;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Date getYop() {
		return yop;
	}
	public void setYop(Date yop) {
		this.yop = yop;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}	


}
