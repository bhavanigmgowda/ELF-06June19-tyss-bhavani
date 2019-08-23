package com.tyss.springcore.springs.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tyss.springcore.bean.DeptBean;
import com.tyss.springcore.bean.EmpBean;

@Configuration
public class DeptConfig {
	@Primary
	@Bean(name="IT")
	public DeptBean getDeptIT() {
		DeptBean deptBean=new DeptBean();
		deptBean.setDeptId(1);
		deptBean.setDeptName("IT");
		return deptBean;
	}
	@Bean(name="HR")
	public DeptBean getDeptHR() {
		DeptBean deptBean=new DeptBean();
		deptBean.setDeptId(2);
		deptBean.setDeptName("HR");
		return deptBean;
	}
	@Bean(name="testing")
	public DeptBean getDeptTest() {
		DeptBean deptBean=new DeptBean();
		deptBean.setDeptId(3);
		deptBean.setDeptName("testing");
		return deptBean;
	}

}
