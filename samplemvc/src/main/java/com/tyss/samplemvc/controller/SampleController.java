package com.tyss.samplemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.samplemvc.model.PrintName;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/print")
	public String printScreen() {
		return"printjsp";
	}
	
	
	@GetMapping("/button")
	public String printName(ModelMap modelMap) {
		PrintName name=new PrintName();
		String n=name.getName();
		modelMap.addAttribute("name",n);
		return "printjsp";
	}
}
