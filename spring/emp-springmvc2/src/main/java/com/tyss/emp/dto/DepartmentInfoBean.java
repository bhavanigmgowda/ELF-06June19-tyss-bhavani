package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="depatment_info")
public class DepartmentInfoBean implements Serializable{
@Id
@Column(name="dept_id")
private int deptId; 
@Column(name="dept_name")
private String deptName; 
}