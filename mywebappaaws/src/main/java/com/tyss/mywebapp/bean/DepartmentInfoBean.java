package com.tyss.mywebapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_info")
public class DepartmentInfoBean {
	@Id
	@Column(name="dept_id")
	private int deptId;
	@Column(name="dept_name")
	private String deptName;	

}
