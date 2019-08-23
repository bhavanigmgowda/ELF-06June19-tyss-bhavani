package com.tyss.lms.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.lms.dto.BookAllotmentBean;
import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.repository.BookAllRepository;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@EntityScan(basePackages = "com.tyss")
@RequestMapping("/library/alloted")
public class BookAllotmentController {

	@Autowired
	BookAllRepository repository;
	@Autowired
	BookController controller;

	private void quantity(BookDetailsBean bean, String val) {
		int quantity = bean.getQuantity();
		if (val.equals("delete")) {
			quantity++;
		} else {
			quantity--;
		}
		bean.setQuantity(quantity);
		controller.updateBook(bean);
	}

	@PostMapping(path = "/createAllocate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createEmp(@RequestBody BookAllotmentBean bean) {
		LibraryResponse response = new LibraryResponse();
		if (!repository.existsById(bean.getBookallId())) {
			BookAllotmentBean registerBean = bean;
			response.setStatusCode(201);
			quantity(bean.getISBNNo(),"create");
			repository.save(registerBean);
			response.setMessage("successfull");
			response.setDecription("User Book inserted successfully ");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDecription("User Book not inserted");
		}
		return response;
	}

	@GetMapping(path = "/getBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getBook(@RequestParam int id, HttpServletRequest request) {
		LibraryResponse response = new LibraryResponse();
		if (request.getSession(false) != null) {

			if (repository.existsById(id)) {
				BookAllotmentBean bean = repository.findById(id).get();

				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User Book found successfully ");
				response.setBeans(Arrays.asList(bean));
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User Book not  found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}

	}

	@GetMapping(path = "/getAllBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllBook(HttpServletRequest request) {
		LibraryResponse response = new LibraryResponse();

		if (request.getSession(false) != null) {
			List<BookAllotmentBean> bean = (List<BookAllotmentBean>) repository.findAll();
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User Book found successfully ");
				response.setBeans(Arrays.asList(bean));
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User Book not  found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}

	}

	@DeleteMapping(path = "/deleteBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam int id, HttpServletRequest request) {

		LibraryResponse response = new LibraryResponse();
		if (request.getSession(false) != null) {

			BookAllotmentBean bean = repository.findById(id).get();
			if (bean != null) {
				repository.delete(bean);
				quantity(bean.getISBNNo(), "delete");
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User Book Deleted successfully ");

				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User Book not Deleted found");
			}
			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}

	}

}
