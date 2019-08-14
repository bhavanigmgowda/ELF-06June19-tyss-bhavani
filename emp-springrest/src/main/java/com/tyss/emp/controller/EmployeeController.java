package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernat")
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping("/createEmployee")
	public @ResponseBody boolean createEmp(@RequestBody EmployeeInfoBean bean) {
		return dao.createEmployeeInfo(bean);
	}

	@DeleteMapping("/deleteEmployee")
	public @ResponseBody boolean deleteEmp(@RequestParam("id") int id) {
		return dao.deleteEmployeeInfo(id);
	}

	@PutMapping("/updateEmployee")
	public  @ResponseBody boolean updateEmp(@RequestBody EmployeeInfoBean bean) {
		return dao.updateEmployeeInfo(bean);
	}

	@GetMapping(path="/getEmployee", produces  = {MediaType.APPLICATION_JSON_VALUE})
	public  @ResponseBody EmployeeInfoBean getEmp(@RequestParam("id") int id) {
		return dao.getEmployeeInfo(id);
	}
	

	@GetMapping(path =  "/getAllEmployee",produces  = {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody List<EmployeeInfoBean> getAllEmp() {
		return dao.getAllEmployeeInfo();
	}
}
