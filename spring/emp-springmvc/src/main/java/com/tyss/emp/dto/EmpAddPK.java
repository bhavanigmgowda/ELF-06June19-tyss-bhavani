package com.tyss.emp.dto;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Embeddable
@Data
public class EmpAddPK  implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean; 
	 private String addresType;
}
