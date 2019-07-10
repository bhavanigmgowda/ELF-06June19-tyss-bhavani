package com.tyss.hibernatapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.tyss.hibernatapp.dto.EmployeeInfoBean;
import com.tyss.hibernatapp.util.HibernatUtil;

import lombok.extern.java.Log;
@Log
public class ProjectionsEmp {

	
	public static void main(String[] args) {
		SessionFactory factory=HibernatUtil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class);
		Projection pro=Projections.property("id");
		Projection pro1=Projections.property("name");
		Projection pro2=Projections.property("email");
		
		ProjectionList listProjectionList =Projections.projectionList();
		listProjectionList.add(pro);
		listProjectionList.add(pro1);
		listProjectionList.add(pro2);
	criteria.setProjection(listProjectionList);
	List<Object[]> list =criteria.list();
		for(Object[] s :list) {
			log.info(" ID  "+s[0]);
			log.info(" Name "+s[1]);
			log.info(" email "+s[2]);
		}
	}
}
