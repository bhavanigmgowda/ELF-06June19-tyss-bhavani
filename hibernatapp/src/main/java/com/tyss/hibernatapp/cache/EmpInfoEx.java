package com.tyss.hibernatapp.cache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="emp_info_ex")
public class EmpInfoEx {
	@Id
	@Column(name="eid")
	private int id ;
	@Column(name="name")
	private String name	;     
	@Column(name="email")
	private String email;
}
