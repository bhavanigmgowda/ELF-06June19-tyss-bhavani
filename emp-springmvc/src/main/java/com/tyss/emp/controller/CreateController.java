package com.tyss.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeAddresInfoBean;
import com.tyss.emp.dto.EmployeeEducationInfoBean;
import com.tyss.emp.dto.EmployeeExperinceInfoBean;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

@Controller
@RequestMapping("/save")
public class CreateController {
	@Autowired
	@Qualifier("hibernat")
	EmployeeDAO dao;
	@PostMapping("/submit") 
	 public String employeeSave(EmployeeInfoBean bean, ModelMap modelMap, Integer managerId) { 
	 modelMap.addAttribute("EmployeeInfoBean",bean.toString());
		List<EmployeeEducationInfoBean> eduInfobean=bean.getEduInfobean();
		for(EmployeeEducationInfoBean educationInfoBean:eduInfobean) {
			educationInfoBean.getEduPk().setInfoBean(bean);
		}
		
		List<EmployeeAddresInfoBean> addressInfobean=bean.getAddressInfobean();
		for(EmployeeAddresInfoBean employeeAddresInfoBean:addressInfobean) {
			employeeAddresInfoBean.getEmpPK().setInfoBean(bean);
		}
		
		List<EmployeeExperinceInfoBean> expInfobean=bean.getExpInfobean();
		for(EmployeeExperinceInfoBean employeeExperinceInfoBean:expInfobean) {
			employeeExperinceInfoBean.getEmpExp().setInfoBean(bean);;
		}
		EmployeeOtherInfoBean empotherinfo=bean.getOtherInfo();
		empotherinfo.setOtherinfobean(bean);
		
		modelMap.addAttribute("msg", "Employee");

		System.out.println("emp form");

		modelMap.addAttribute("EmployeeInfoBean", bean.toString());

		boolean isInserted = dao.createEmployeeInfo(bean);
		if (isInserted) {
			modelMap.addAttribute("msg", "Employee Created successfully");
		} else {
			modelMap.addAttribute("msg", "Employee creation faileds");
		}
		return "loginPage";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}
