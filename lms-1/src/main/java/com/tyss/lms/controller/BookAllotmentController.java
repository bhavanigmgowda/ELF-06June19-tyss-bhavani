package com.tyss.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.BookAllotmentBean;
import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.BookAllRepository;
import com.tyss.lms.repository.UserRepository;

@RestController
@EntityScan(basePackages = "com.tyss")
@RequestMapping("/library/alloted")
public class BookAllotmentController {

	@Autowired
	BookAllRepository repository;

	private void quantity() {
		BookDetailsBean bookDetailsBean = new BookDetailsBean();
		int quantity = bookDetailsBean.getQuantity();
		quantity--;
		bookDetailsBean.setQuantity(quantity);
		BookController controller = new BookController();
		controller.updateBook(bookDetailsBean);
	}

	@PostMapping(path = "/createAllocate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createEmp(@RequestBody BookAllotmentBean bean) {
		LibraryResponse response = new LibraryResponse();
		if (!repository.existsById(bean.getBookallId())) {
			response.setStatusCode(201);
			quantity();
			repository.save(bean);
			response.setMessage("successfull");
			response.setDecription("User data inserted successfully ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User data not inserted");
		}
		return response;
	}
	
	@GetMapping(path="/getBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getBook(@RequestParam int id,HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();

		if(request.getSession(false)!=null) {

		if(repository.existsById(id)) {
			BookAllotmentBean bean=repository.findById(id).get();

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

}
