package com.tyss.emp.cont;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CookieController {
	@GetMapping("/getCookiePage")
	public String getCookiePage() {
		return "createCookie";
	}
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp,ModelMap modelMap) {
		Cookie cookie=new Cookie("name", "abc");
		resp.addCookie(cookie);
		modelMap.addAttribute("msg","cookie added sucessfully");
		return "createCookie";
	}
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="name") String name,ModelMap modelMap) {
		modelMap.addAttribute("msg",name);
		return "createCookie";
	}
}

