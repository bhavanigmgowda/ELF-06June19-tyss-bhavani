package com.tyss.hibernatapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.tyss.hibernatapp.manytomany.TrainingInfoBean;
import com.tyss.hibernatapp.manytoone.EducationEmbBean;
import com.tyss.hibernatapp.manytoone.EmpAddPK;
import com.tyss.hibernatapp.manytoone.EmployeeEducationInfoBean;
import com.tyss.hibernatapp.manytoone.EmployeeExperinceInfoBean;
import com.tyss.hibernatapp.manytoone.ExpPK;
import com.tyss.hibernatapp.mappingdto.EmployeeAddresInfoBean;
import com.tyss.hibernatapp.mappingdto.EmployeeInfoBean;
import com.tyss.hibernatapp.mappingdto.EmployeeOtherInfoBean;
import com.tyss.hibernatapp.onetoone.util.HibernateImpl;

public class EmpTest {
	public static void main(String[] args) {
		
		/*
		 * SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd"); Date date1=null;
		 * Date date2=null; try { date1=format.parse("2017-09-08");
		 * date2=format.parse("2018-09-08");
		 * 
		 * } catch (ParseException e) { e.printStackTrace(); }
		 * 
		 * EmployeeInfoBean emp=new EmployeeInfoBean(); emp.setId(110);
		 * emp.setName("bhavani"); emp.setAccountNumber(5245456); emp.setAge(23);
		 * emp.setDeptId(10); emp.setDesignation("HR"); emp.setDob(new Date(2018-2-07));
		 * emp.setEmail("bhg@gmail"); emp.setGender("f"); emp.setJoiningDate(new
		 * Date(2018-10-12)); emp.setMngrId(6); emp.setPhnum(6576545);
		 * emp.setSalary(200000);
		 * 
		 * EmployeeOtherInfoBean empOther= new EmployeeOtherInfoBean();
		 * empOther.setAdhar(878545); empOther.setBloodGroup("a+");
		 * empOther.setEmergencyContactName("bhgg");
		 * empOther.setEmergencyContactNumber(54654251); empOther.setFatherNm("hkjh");
		 * empOther.setHusbandNm("no"); empOther.setIsChallenged("no");
		 * empOther.setIsMarried("no"); empOther.setMotherNm("jkgjh");
		 * empOther.setNationality("hindu"); empOther.setPan(348786);
		 * empOther.setPassport(5677454); empOther.setReligion("indian");
		 * empOther.setSpouseNm("no"); empOther.setEmp(emp);
		 * 
		 * EmpAddPK addPK=new EmpAddPK(); addPK.setAddresType("T");
		 * addPK.setEmployeeInfoBean(emp);
		 * 
		 * EmpAddPK addPK1=new EmpAddPK(); addPK1.setAddresType("p");
		 * addPK1.setEmployeeInfoBean(emp);
		 * 
		 * 
		 * EmployeeAddresInfoBean addresInfoBean1=new EmployeeAddresInfoBean();
		 * addresInfoBean1.setAddress1("aaaaaaaa");
		 * addresInfoBean1.setAddress2("bbbbbbb"); addresInfoBean1.setCity("zzz");
		 * addresInfoBean1.setLandmark("temple"); addresInfoBean1.setPincode(7777);
		 * addresInfoBean1.setState("kar"); addresInfoBean1.setPk(addPK1);
		 * 
		 * EmployeeAddresInfoBean addresInfoBean2=new EmployeeAddresInfoBean();
		 * addresInfoBean2.setAddress1("aaaaaaaa");
		 * addresInfoBean2.setAddress2("bbbbbbb"); addresInfoBean2.setCity("zzz");
		 * addresInfoBean2.setLandmark("temple"); addresInfoBean2.setPincode(7777);
		 * addresInfoBean2.setState("kar"); addresInfoBean2.setPk(addPK1);
		 * 
		 * addresInfoBean1.setPk(addPK); addresInfoBean2.setPk(addPK1);
		 * 
		 * EducationEmbBean embBean1 =new EducationEmbBean();
		 * embBean1.setEducationType("d"); embBean1.setEmployeeInfoBean(emp);
		 * 
		 * EducationEmbBean embBean2 =new EducationEmbBean();
		 * embBean2.setEducationType("mtec"); embBean2.setEmployeeInfoBean(emp);
		 * 
		 * EmployeeEducationInfoBean educationInfoBean1=new EmployeeEducationInfoBean();
		 * educationInfoBean1.setBranch("cs"); educationInfoBean1.setCollageNm("abc");
		 * educationInfoBean1.setDegreeType("BE");
		 * educationInfoBean1.setLocation("zzz");
		 * educationInfoBean1.setPercentage(50.65);
		 * educationInfoBean1.setUniversity("tt"); educationInfoBean1.setYop(new
		 * Date(2018));
		 * 
		 * 
		 * EmployeeEducationInfoBean educationInfoBean2=new EmployeeEducationInfoBean();
		 * educationInfoBean2.setBranch("cs"); educationInfoBean2.setCollageNm("abc");
		 * educationInfoBean2.setDegreeType("BE");
		 * educationInfoBean2.setLocation("zzz");
		 * educationInfoBean2.setPercentage(50.65);
		 * educationInfoBean2.setUniversity("tt"); educationInfoBean2.setYop(new
		 * Date(2018));
		 * 
		 * educationInfoBean1.setEducationEmbBean(embBean1);
		 * educationInfoBean2.setEducationEmbBean(embBean2);
		 * 
		 * EmployeeExperinceInfoBean experinceInfoBean1=new EmployeeExperinceInfoBean();
		 * experinceInfoBean1.setDesignation("qqqq");
		 * experinceInfoBean1.setJoinimgDate(date1);
		 * experinceInfoBean1.setLeavingDate(date2);
		 * 
		 * EmployeeExperinceInfoBean experinceInfoBean2=new EmployeeExperinceInfoBean();
		 * experinceInfoBean2.setDesignation("qqqq");
		 * experinceInfoBean2.setJoinimgDate(date2);
		 * experinceInfoBean2.setLeavingDate(date1);
		 * 
		 * ExpPK expPK1=new ExpPK(); expPK1.setCompanyNm("aaa");
		 * expPK1.setInfoBean(emp);
		 * 
		 * ExpPK expPK2=new ExpPK(); expPK2.setCompanyNm("bbb");
		 * expPK2.setInfoBean(emp);
		 * 
		 * experinceInfoBean1.setExpPK(expPK1); experinceInfoBean2.setExpPK(expPK2);
		 * 
		 * HibernateImpl impl=new HibernateImpl(); impl.createEmp(emp, empOther,
		 * Arrays.asList(addresInfoBean1,addresInfoBean2)
		 * ,Arrays.asList(educationInfoBean1,educationInfoBean2),Arrays.asList(
		 * experinceInfoBean1,experinceInfoBean2));
		 */
		
		EmployeeInfoBean bean1=new EmployeeInfoBean();
		bean1.setId(1);
		bean1.setName("bbb");
		bean1.setEmail("aaaaaa");
		

		EmployeeInfoBean bean2=new EmployeeInfoBean();
		bean2.setId(2);
		bean2.setName("bbb");
		bean2.setEmail("aaaaaa");
		

		EmployeeInfoBean bean3=new EmployeeInfoBean();
		bean3.setId(3);
		bean3.setName("bbb");
		bean3.setEmail("aaaaaa");
		
		TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
		trainingInfoBean.setCourseId(10);
		trainingInfoBean.setCourseName("java");
		trainingInfoBean.setCourseType("full");
		trainingInfoBean.setDuration(1);
		trainingInfoBean.setInfoBeans(Arrays.asList(bean1,bean2,bean3));
		
		HibernateImpl hibernateImpl=new HibernateImpl();
		hibernateImpl.createTraining(trainingInfoBean);
	}
}
