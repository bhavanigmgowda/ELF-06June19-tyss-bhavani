package com.tyss.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Table(name = "user_register")
@JsonRootName(value = "user_register_bean")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "userId")
@Data
public class UserRegisterBean implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "email")
	private String email;
	
	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String Password;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_no")
	private Integer phoneNo;


	@Column(name = "user_type")
	private String userType;

}
