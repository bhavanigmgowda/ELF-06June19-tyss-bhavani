package com.tyss.hibernatapp.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tyss.hibernatapp.mappingdto.EmployeeInfoBean;

import lombok.Data;
@Embeddable
@Data
public class EmpAddPK  implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean employeeInfoBean; 
	 private String addresType;
}
