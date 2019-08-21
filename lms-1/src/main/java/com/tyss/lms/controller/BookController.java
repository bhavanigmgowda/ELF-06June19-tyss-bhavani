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

import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.BookRepository;
	@RestController
	@EntityScan(basePackages = "com.tyss")
	@RequestMapping("/library/book")
	public class BookController {
		@Autowired
		BookRepository repository;
		
				
		@PostMapping(path="/createBook",
				produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public LibraryResponse createBook(@RequestBody BookDetailsBean bean) {
			LibraryResponse response=new LibraryResponse();
			if(!repository.existsById(bean.getISBNNo())) {
				response.setStatusCode(201);
				repository.save(bean); 
				response.setMessage("successfull");
				response.setDecription("User data inserted successfully ");
			}else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not inserted");
			}
			return response;
		}
		@PutMapping(path="/updateBook",
				produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public LibraryResponse updateBook(@RequestBody BookDetailsBean bean) {
			
			LibraryResponse response=new LibraryResponse();
			if(repository.existsById(bean.getISBNNo())) {
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
		
		@GetMapping(path="/getBook", produces = MediaType.APPLICATION_JSON_VALUE)
		public LibraryResponse getBook(@RequestParam int id,HttpServletRequest request) {
			LibraryResponse response=new LibraryResponse();

			if(request.getSession(false)!=null) {

			if(repository.existsById(id)) {
				BookDetailsBean bean=repository.findById(id).get();

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
		@GetMapping(path =  "/searchBook",produces  = {MediaType.APPLICATION_JSON_VALUE})
		public LibraryResponse Book(@RequestParam String name,HttpServletRequest request) {
			LibraryResponse response=new LibraryResponse();
			if(request.getSession(false)!=null) {
				List<BookDetailsBean> bean= repository.searchByName(name);

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

		@GetMapping(path="/getAllBook", produces = MediaType.APPLICATION_JSON_VALUE)
		public LibraryResponse getAllBook(HttpServletRequest request) {
			LibraryResponse response=new LibraryResponse();

			if(request.getSession(false)!=null) {
			List<BookDetailsBean> bean=(List<BookDetailsBean>) repository.findAll();
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
		@DeleteMapping(path="/deleteBook", produces = MediaType.APPLICATION_JSON_VALUE)
		public LibraryResponse deleteBook(@RequestParam int id,HttpServletRequest request) {
			
			LibraryResponse response=new LibraryResponse();
			if(request.getSession(false)!=null) {

				BookDetailsBean bean=repository.findById(id).get();
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


