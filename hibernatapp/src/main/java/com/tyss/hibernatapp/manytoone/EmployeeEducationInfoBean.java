package com.tyss.hibernatapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Education_Info")

public class EmployeeEducationInfoBean  implements Serializable {
	@EmbeddedId
	private EducationEmbBean educationEmbBean;
	private String degreeType	;
	private String branch	;		
	private String collageNm;		
	private String university;		
	private Date yop	;		
	private double percentage;		
	private String location	;	


}
