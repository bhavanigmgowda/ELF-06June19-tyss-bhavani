package com.tyss.employee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.employee.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {

	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}
//by using HttpServletRequest
	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest request) {
		int userID=Integer.parseInt(request.getParameter("userID"));
		String password=request.getParameter("password");
		request.setAttribute("userID", userID);
		request.setAttribute("password", password);
		return "formDisplay";
	}
	
	//using parameter
	@PostMapping("/formSubmit2")
	public String submitForm2(int userID,String password,ModelMap modelMap) {
		modelMap.addAttribute("userID",userID);
		modelMap.addAttribute("password",password);
		
		return "formDisplay";
		
	} 
	
	//by using bean class
	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean",userBean);
		return "formBeanDisplay";
	}
	//no need to use the name of the jsp
	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name="userID") int userID,
			@RequestParam(name="password")String password,ModelMap modelMap) {
		modelMap.addAttribute("userID",userID);
		modelMap.addAttribute("password",password);
		
		return "formDisplay";
	}
	//using pattern
	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name="userID") int userID,
			@RequestParam(name="password")String password,ModelMap modelMap) {
		modelMap.addAttribute("userID",userID);
		modelMap.addAttribute("password",password);
		
		return "formData";
	}
	//using pattern for pattern
	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean",userBean);
		return "formData2";
	}
}
