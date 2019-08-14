package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;
@Data
@Embeddable
public class EducationEmbBean implements Serializable {
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean; 
	private String educationType;
}
