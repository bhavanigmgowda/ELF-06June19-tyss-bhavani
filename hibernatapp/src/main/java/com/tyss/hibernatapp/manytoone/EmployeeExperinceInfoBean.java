package com.tyss.hibernatapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Employee_Experince_Info")
public class EmployeeExperinceInfoBean implements Serializable{
	@EmbeddedId
	private ExpPK expPK;
	private String designation;	
	private Date joinimgDate;	
	private Date leavingDate;	
}
