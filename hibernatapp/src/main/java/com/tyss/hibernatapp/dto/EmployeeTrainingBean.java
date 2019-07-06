package com.tyss.hibernatapp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class EmployeeTrainingBean {
	private int id	;		
	private int courseId; 	


}
