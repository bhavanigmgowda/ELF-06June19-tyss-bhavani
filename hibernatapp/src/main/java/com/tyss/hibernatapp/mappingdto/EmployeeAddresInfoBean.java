package com.tyss.hibernatapp.mappingdto;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.tyss.hibernatapp.manytoone.EmpAddPK;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_Addres_Info")
public class EmployeeAddresInfoBean implements Serializable {
	@EmbeddedId
	private EmpAddPK pk;
	
	private String address1;		
	 private String address2;		
	 private String landmark;		
	 private String city; 			
	 private String state; 			
	 private int pincode; 		
}
