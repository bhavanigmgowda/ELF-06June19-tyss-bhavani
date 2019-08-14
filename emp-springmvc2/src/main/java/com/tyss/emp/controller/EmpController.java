package com.tyss.emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactoryOld;
import com.tyss.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/abc")
//@PropertySource("classpath:message.properties")

public class EmpController {

	@GetMapping("/login")
	public String getMessage(ModelAndView modelAndView) {
		return "loginPage";
	}

	@PostMapping("/loginsubmit")
	public String submitForm2(int id, String password, ModelMap modelMap, HttpServletRequest request,
			@Value("${object}") String object) {

		EmployeeDAO dao = EmployeeDAOFactoryOld.getinstance(object);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean == null) {
			modelMap.addAttribute("msg", "ID is not valid");
			return "login";
		} else if (bean.getPassword().equals(password)) {
			HttpSession session = request.getSession(true);
			modelMap.addAttribute("bean", bean);
			return "HomeJSP";
		}
		modelMap.addAttribute("msg", "enter all the data");
		return "login";
	}

	@GetMapping("/logoutsubmit")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logout successfully ");
		return "loginPage";
	}
	@GetMapping("/search")
	public String seach(HttpServletRequest response, @RequestParam int id, @Value("${object}") String object) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getinstance(object);
		List<EmployeeInfoBean> bean = dao.getAllSearchedEmployee(id);

		response.setAttribute("bean", bean);
		return "searchEmp";
	}
	@GetMapping("/validate1")
	public String validateSession(HttpServletRequest request, ModelMap modelMap, @RequestParam String url,
			@Value("$(msg)") String msg) {
		if (request.getSession(false) == null) {
			modelMap.addAttribute("msg", msg);
			return "loginPage";
		}
		return "forward:/abc/" + url;
	}

	@PostMapping("/validate1")
	public String validateSessionForPost(HttpServletRequest request, ModelMap modelMap, @RequestParam String url,
			@Value("$(msg)") String msg) {
		return validateSession(request, modelMap, url, msg);
	}

	@GetMapping("/validate/{url}")
	public String validateSession3(HttpServletRequest request, ModelMap modelMap, @Value("${msg}") String msg,
			@PathVariable("url") String url) {
		if (request.getSession(false) == null) {
			modelMap.addAttribute("msg", msg);
			return "loginPage";
		}
		return "forward:/abc/" + url;
	}
}
