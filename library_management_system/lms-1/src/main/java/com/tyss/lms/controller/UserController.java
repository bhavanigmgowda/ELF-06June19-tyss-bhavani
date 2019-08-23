package com.tyss.lms.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dao.UserDAO;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.UserRepository;


@RestController
@EntityScan(basePackages = "com.tyss")
@RequestMapping("/library/user")
@CrossOrigin(origins="http://localhost:3000")

public class UserController {
	@Autowired
	UserRepository repository;
	
	@Autowired
	UserDAO user;
	
	@PostMapping(path="/createUser",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createUser(@RequestBody UserRegisterBean bean) {
		return user.createUser(bean);
	}
	
	@PutMapping(path="/updateUser",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateUser(@RequestBody UserRegisterBean bean) {
		
		return user.updateUser(bean);
	}
	
	@GetMapping(path="/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getUser(@RequestParam int id,HttpServletRequest request) {
		return user.getUser(id, request);
	}
	@GetMapping(path =  "/searchUser",produces  = {MediaType.APPLICATION_JSON_VALUE})
	public LibraryResponse getSearch(@RequestParam String userName,HttpServletRequest request) {
		return user.getSearch(userName, request);
	}

	@GetMapping(path="/getAllUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllUser(HttpServletRequest request) {
		return user.getAllUser(request);
	}
		
 
	
	@DeleteMapping(path="/deleteUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteUser(@RequestParam int id,HttpServletRequest request) {
		
		return user.deleteUser(id, request);
	}
}
