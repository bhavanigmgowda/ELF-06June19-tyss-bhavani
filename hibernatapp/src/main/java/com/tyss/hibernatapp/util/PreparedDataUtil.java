package com.tyss.hibernatapp.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tyss.hibernatapp.onetoone.EmployeeInfoBean;
import com.tyss.hibernatapp.onetoone.EmployeeOtherInfoBean;

public class PreparedDataUtil {

	private PreparedDataUtil() {
	
	}
	public static EmployeeInfoBean prepareData(int id) {
			EmployeeInfoBean emp=new EmployeeInfoBean();
			emp.setId(id);
			emp.setName("bhavani");
			emp.setAccountNumber(5245456);
			emp.setAge(23);
			emp.setDeptId(10);
			emp.setDesignation("HR");
			emp.setDob(new Date(2018-2-07));
			emp.setEmail("bhg@gmail");
			emp.setGender("f");
			emp.setJoiningDate(new Date(2018-10-12));
			emp.setMngrId(6);
			emp.setPhnum(6576545);
			emp.setSalary(200000);
		
			List<EmployeeOtherInfoBean> bean = new ArrayList<EmployeeOtherInfoBean>();
			EmployeeOtherInfoBean empOther= new EmployeeOtherInfoBean();
			empOther.setId(id);
			empOther.setAdhar(878545);
			empOther.setBloodGroup("a+");
			empOther.setEmergencyContactName("bhgg");
			empOther.setEmergencyContactNumber(54654251);
			empOther.setFatherNm("hkjh");
			empOther.setHusbandNm("no");
			empOther.setIsChallenged("no");
			empOther.setIsMarried("no");
			empOther.setMotherNm("jkgjh");
			empOther.setNationality("hindu");
			empOther.setPan(348786);
			empOther.setPassport(5677454);
			empOther.setReligion("indian");
			empOther.setSpouseNm("no");
			bean.add(empOther);
			emp.setOtherInfo( bean);
			
			return emp;
	}
}
