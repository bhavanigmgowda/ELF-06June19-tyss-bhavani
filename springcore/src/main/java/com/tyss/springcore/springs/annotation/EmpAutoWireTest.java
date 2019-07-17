package com.tyss.springcore.springs.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tyss.springcore.bean.EmpBean;

import lombok.extern.java.Log;
@Log
public class EmpAutoWireTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		EmpBean messageBean=context.getBean(EmpBean.class);
		log.info("emp name "+messageBean.getName());
		log.info("emp ID "+messageBean.getId());
		
		log.info("Dept ID "+messageBean.getDeptBean().getDeptId());
		log.info("Dept ID "+messageBean.getDeptBean().getDeptName());

		((AbstractApplicationContext)context).close();
	}
}
