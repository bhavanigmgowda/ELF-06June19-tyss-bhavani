package com.tyss.springcore.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.CourseBean;
import com.tyss.springcore.bean.Pet;

import lombok.extern.java.Log;
@Log
public class CourseProperty {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("course.xml");
	CourseBean courseBean=(CourseBean)context.getBean("course");
	
		
		log.info(""+courseBean.getFaculty());
		log.info(""+courseBean.getCourseID());
		log.info(""+courseBean.getCourseName());
		
}
}
