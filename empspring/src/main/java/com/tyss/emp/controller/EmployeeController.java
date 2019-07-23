package com.tyss.emp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/abc")
public class EmployeeController {
	
	@GetMapping("/login")
	public String getMessage(ModelAndView modelAndView) {
		return "login";
	}
	
	@PostMapping("/loginsubmit")
	public String submitForm2(int id,String password,ModelMap modelMap) {
		

		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean==null) {
			modelMap.addAttribute("msg", "ID is not valid");
			modelMap.addAttribute("bean", bean);
			return "login";
		} else if (bean.getPassword().equals(password)) {
			return "HomeJSP";
		}
		modelMap.addAttribute("msg", "enter all the data");
		return "login";
	}
}
