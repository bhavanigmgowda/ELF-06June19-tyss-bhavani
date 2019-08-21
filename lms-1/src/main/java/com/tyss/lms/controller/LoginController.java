package com.tyss.lms.controller;




import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.UserRepository;


@RestController
@RequestMapping("/login")

@EntityScan(basePackages = "com.tyss")
//@CrossOrigin(origins="http://localhost:3000")
public class LoginController {
	@Autowired
	UserRepository repository;
	@PostMapping(value="/loginPage",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse submitForm(String email,String password,HttpServletRequest request) {
		UserRegisterBean bean = repository.searchByEmail(email);
		LibraryResponse response=new LibraryResponse();
		 if (bean!=null && bean.getPassword().equals(password)) {
			 
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDecription("Login successfully");
			response.setBeans(Arrays.asList(bean));
			 request.getSession().setAttribute("bean", bean);
			 
		}else {
			response.setStatusCode(200);
			response.setMessage("Failed");
			response.setDecription("Login Failed");
		}
		 return response;
	}
	@GetMapping("/logoutsubmit")
	public LibraryResponse logout(HttpSession session) {
		LibraryResponse response=new LibraryResponse();
		session.invalidate();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDecription("Logout successfully");
		return response;
	}
	@GetMapping("/readCookie")
	public LibraryResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		LibraryResponse response=new LibraryResponse();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDecription("JSESSIONID:"+sessionId);
		return response;
	}
}
	

