package com.tyss.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abc")
public class EmpControler {
	@RequestMapping(path="/getMessage",method=RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("../WEB-INF/views/MsgPage.jsp");
		return modelAndView;
	}
	@GetMapping("/seeMsg")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("../WEB-INF/views/MsgPage.jsp");
		return modelAndView;
	}
}
