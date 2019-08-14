package com.tyss.emp.dto;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)

public class EmpAddPK  implements Serializable{
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean; 
	 private String addresType;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getAddresType() {
		return addresType;
	}
	public void setAddresType(String addresType) {
		this.addresType = addresType;
	}
	 
}
