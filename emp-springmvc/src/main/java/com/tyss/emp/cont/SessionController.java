package com.tyss.emp.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tyss.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {
	@GetMapping("/login")
	public String loginForm() {
		return "myForm";
	}//End of Login
	@PostMapping("/login")
	public String authenticate(UserBean userBean,HttpServletRequest request) {
		if(userBean.getUserid()==101 && userBean.getPassword().equals("qwe")) {
			HttpSession session=request.getSession(true);
			}
		return "usesHome";
	}
}//End of class
