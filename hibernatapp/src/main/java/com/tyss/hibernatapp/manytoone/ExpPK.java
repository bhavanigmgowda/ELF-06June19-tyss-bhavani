package com.tyss.hibernatapp.manytoone;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tyss.hibernatapp.mappingdto.EmployeeInfoBean;

import lombok.Data;
@Data
@Embeddable
public class ExpPK implements Serializable {
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	private String companyNm;
}
