package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
import com.tyss.emp.dto.EmployeeAddresInfoBean;
import com.tyss.emp.dto.EmployeeEducationInfoBean;
import com.tyss.emp.dto.EmployeeExperinceInfoBean;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

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
	@GetMapping("/updateEmp")
	public String getUpdateEmp() {
		return "updateEmp";
	}
	
	@PostMapping("/updateEmp")
	public String updateEmp(EmployeeInfoBean infoBean, int mngrId) {
		EmployeeInfoBean bean=dao.getEmployeeInfo(mngrId);
		infoBean.setManagerId(bean);
		dao.updateEmployeeInfo(infoBean);
		return "HomeJSP";
	}
}
