package com.tyss.springcore.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.extern.java.Log;
@Log

public class EmpBean {
	/*
	 * public EmpBean(String name, int id, DeptBean deptBean) { super(); this.name =
	 * name; this.id = id; this.deptBean = deptBean; }
	 */
	String name;
	int id;
	
	
	
	@Autowired
	@Qualifier("IT")
	private DeptBean deptBean;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DeptBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}

	public void destroy() { 
		log.info("DisposableBean");	

	}
	public void afterPropertiesSet() {
		log.info("InitializingBean");	

	}
	
}
