package com.tyss.springcore.springs;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.EmpBean;

import lombok.extern.java.Log; 
@Log
public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EmpBean messageBean = (EmpBean) context.getBean("emp");

		/*
		 * Scanner sc=new Scanner(System.in); log.info("enter the name");
		 * messageBean.setName(sc.next()); log.info("enter the ID");
		 * messageBean.setId(sc.nextInt());
		 */
		log.info("emp name "+messageBean.getName());
		log.info("emp ID "+messageBean.getId());
		
		log.info("Dept ID "+messageBean.getDeptBean().getDeptId());
		log.info("Dept ID "+messageBean.getDeptBean().getDeptName());

		((AbstractApplicationContext)context).close();
	}
}
                      