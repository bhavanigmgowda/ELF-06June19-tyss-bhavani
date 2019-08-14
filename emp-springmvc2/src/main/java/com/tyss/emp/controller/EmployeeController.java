package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactoryOld;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	@Qualifier("hibernat")
	EmployeeDAO dao;
	@GetMapping("/search")
	public String employeeSeach(HttpServletRequest response, @RequestParam int id) {
		List<EmployeeInfoBean> bean = dao.getAllSearchedEmployee(id);
		response.setAttribute("bean", bean);
		return "searchEmp";
	}
	@GetMapping("/create")
	public String create() {
		return "savedataJSP";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@PostMapping("/employeeSubmit") 
	 public String employeeSave(EmployeeInfoBean bean, ModelMap modelMap) { 
		modelMap.addAttribute("msg", "Employee");
		
		System.out.println("emp form");

	 modelMap.addAttribute("EmployeeInfoBean",bean.toString());
	
	 boolean isInserted = dao.createEmployeeInfo(bean);
	if(isInserted) {
	modelMap.addAttribute("msg", "Employee Created successfully");
	} else {
	modelMap.addAttribute("msg", "Employee creation faileds");
	}
	return "LoginPage";
	 }
}
