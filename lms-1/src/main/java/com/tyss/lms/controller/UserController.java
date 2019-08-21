package com.tyss.lms.controller;


import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.UserRepository;


@RestController
@EntityScan(basePackages = "com.tyss")
@RequestMapping("/library/user")
public class UserController {
	@Autowired
	UserRepository repository;
	
	@GetMapping(path="/hello",produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Helloworld!!!";
	}
	
	@PostMapping(path="/createUser",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createEmp(@RequestBody UserRegisterBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(!repository.existsById(bean.getUserId())) {
			UserRegisterBean registerBean=new UserRegisterBean();
			response.setStatusCode(201);
			repository.save(registerBean);
			
			response.setMessage("successfull");
			response.setDecription("User data inserted successfully ");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not inserted");
		}
		return response;
	}
	
	@PutMapping(path="/updateUser",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateEmp(@RequestBody UserRegisterBean bean) {
		
		LibraryResponse response=new LibraryResponse();
		if(repository.existsById(bean.getUserId())) {
			response.setStatusCode(201);
			repository.save(bean); 
			response.setMessage("successfull");
			response.setDecription("User data updated successfully ");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not updated");
		}
		return response;
	}
	
	@GetMapping(path="/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getEmp(@RequestParam int id,HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();

		if(request.getSession(false)!=null) {

		if(repository.existsById(id)) {
			UserRegisterBean bean=repository.findById(id).get();

			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("User data found successfully ");
			response.setBeans(Arrays.asList(bean));
			return response;
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not  found");
		}
		return response;
		}
		else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}
		
 
	}
	@GetMapping(path =  "/searchUser",produces  = {MediaType.APPLICATION_JSON_VALUE})
	public LibraryResponse getSearch(@RequestParam int id,HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();
		if(request.getSession(false)!=null) {
			List<UserRegisterBean> bean= repository.searchById(id);

		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("User data selected successfully ");
			response.setBeans(Arrays.asList(bean));
		}else { 
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not  selected successfully ");
		}
		return response;
	}else {
		response.setStatusCode(501);
		response.setMessage("Failure");
		response.setDecription("Please login first");
		return response;
	}
	}

	@GetMapping(path="/getAllUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllEmp(HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();

		if(request.getSession(false)!=null) {
		List<UserRegisterBean> bean=(List<UserRegisterBean>) repository.findAll();
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("User data found successfully ");
			response.setBeans(Arrays.asList(bean));
			return response;
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not  found");
		}
		return response;
		}
		else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}
		
 
	}
	@DeleteMapping(path="/deleteUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteEmp(@RequestParam int id,HttpServletRequest request) {
		
		LibraryResponse response=new LibraryResponse();
		if(request.getSession(false)!=null) {

			UserRegisterBean bean=repository.findById(id).get();
		if(bean!=null) {
			repository.delete(bean);
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDecription("User data Deleted successfully ");

			return response;
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not Deleted found");
		}
		return response;
		}
		else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}
		
	}
	
	
}
