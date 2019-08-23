package com.tyss.emp.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.emp.common.EMPC;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactoryOld;
import com.tyss.emp.dto.EmployeeInfoBean;


@Controller
@RequestMapping("/login")
@PropertySource(EMPC.PROPERTY_FILENAME)

public class LoginController {
	
	@Autowired
	@Qualifier("hibernat")
	EmployeeDAO dao;
	@GetMapping("/loginPage")
	public String getMessage(ModelAndView modelAndView) {
		return EMPC.VIEW_LOGINPAGE;
	}
	
	@PostMapping("/authenticate")
	public String submitForm2(int id,String password, HttpServletRequest request,
			@Value("${valid}") String valid ,@Value("${notEntered}") String notEntered) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean==null) {
			request.setAttribute("msg",valid);
			return "login";
		} else if (bean.getPassword().equals(password)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("bean", bean);
			return EMPC.VIEW_HOMEPAGE;
		}
		request.setAttribute("msg",notEntered);
		return EMPC.VIEW_LOGINPAGE;
	}
	
	@GetMapping("/logoutsubmit")
	public String logout(HttpSession session,ModelMap modelMap,@Value("${Logout}") String Logout) {
		session.invalidate();
		modelMap.addAttribute("msg", Logout);
		return EMPC.VIEW_LOGINPAGE;
	}
	
}

