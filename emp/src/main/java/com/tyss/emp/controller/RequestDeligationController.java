package com.tyss.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDeligationController {
	@GetMapping("/getHomePage")
	public  String getHomePage() {
		return "HomePage";
	}
	
	@GetMapping("./forwardReq")
	public String forwardReq() {
		return "forward:/profile/getForm";
	}
	
}
