package com.tyss.springcore.springs.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcore.bean.EmpBean;
@Import(DeptConfig.class)
@Configuration
public class EmpConfig {
	@Bean
	public EmpBean getEmp() {
		EmpBean empBean= new EmpBean();
		empBean.setId(10);
		empBean.setName("abc");
		return empBean;
		
	}
	
	
}
