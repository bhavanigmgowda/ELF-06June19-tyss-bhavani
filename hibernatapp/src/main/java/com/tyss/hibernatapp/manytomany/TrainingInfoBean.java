package com.tyss.hibernatapp.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.tyss.hibernatapp.mappingdto.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name="TrainingInfoBean")
public class TrainingInfoBean  implements Serializable{
	@Id
	@Column(name="courseId")
	private int courseId;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="courseType")
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Employee_TrainingInfo",
				joinColumns = {@JoinColumn(name="courseId")},
				inverseJoinColumns={@JoinColumn(name="id")})
	List<EmployeeInfoBean> infoBeans;
	
}//end of class
