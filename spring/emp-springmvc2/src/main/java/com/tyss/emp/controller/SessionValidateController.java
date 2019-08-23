package com.tyss.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.common.EMPC;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {
	
	@GetMapping("/validate/{url1}/{url2}")
	public String validateSession(
			HttpServletRequest request, ModelMap modelMap, @Value("${msg}") String msg,
			@PathVariable("url1") String url1,@PathVariable("url2") String url2) {
		if (request.getSession(false) == null) {
			modelMap.addAttribute("msg", msg);
			return EMPC.VIEW_LOGINPAGE;
		}
		return "forward:/" + url1+"/"+url2;
	}
	@PostMapping("/validate")
	public String validateSessionForPost(
			HttpServletRequest request, ModelMap modelMap, @Value("${msg}") String msg,
			@PathVariable("url1") String url1,@PathVariable("url2") String url2) {
		return validateSession(request, modelMap, msg, url1,url2);
	}
}

