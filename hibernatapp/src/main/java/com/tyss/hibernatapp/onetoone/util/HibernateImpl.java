package com.tyss.hibernatapp.onetoone.util;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernatapp.manytomany.TrainingInfoBean;
import com.tyss.hibernatapp.manytoone.EmployeeEducationInfoBean;
import com.tyss.hibernatapp.manytoone.EmployeeExperinceInfoBean;
import com.tyss.hibernatapp.mappingdto.EmployeeAddresInfoBean;
import com.tyss.hibernatapp.mappingdto.EmployeeInfoBean;
import com.tyss.hibernatapp.mappingdto.EmployeeOtherInfoBean;

public class HibernateImpl {
 private Configuration configuration=new Configuration();
 private SessionFactory factory=configuration
		 						.configure("hibernate.cfgmapping.xml")
		 						.buildSessionFactory();
 
 public void createEmp(EmployeeInfoBean infoBean,EmployeeOtherInfoBean otherInfoBean
		 				,List<EmployeeAddresInfoBean> addresInfoBean,
		 				List<EmployeeEducationInfoBean> educationInfoBeans,
		 				List<EmployeeExperinceInfoBean> employeeExperinceInfoBeans) {
	 Session session=factory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(infoBean);
	 session.save(otherInfoBean);
	 for(EmployeeAddresInfoBean addresInfo:addresInfoBean ) {
	 session.save(addresInfo);
	 }
	 for(EmployeeEducationInfoBean educationInfo:educationInfoBeans ) {
		 session.save(educationInfo);
		 }
	 for(EmployeeExperinceInfoBean experinceInfoBean:employeeExperinceInfoBeans ) {
		 session.save(experinceInfoBean);
		 }
	 transaction.commit();
	 session.close();
	 
 }
 public void createTraining(TrainingInfoBean trainingInfoBean ) {
	 Session session=factory.openSession();
	 Transaction transaction=session.beginTransaction();
	 session.save(trainingInfoBean);
	 transaction.commit();
	 session.close();
	 
 }
	
}
