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

import com.tyss.lms.dao.BookDAO;
import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.repository.BookRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@EntityScan(basePackages = "com.tyss")
@RequestMapping("/library/book")
public class BookController {
	@Autowired
	BookRepository repository;
	@Autowired
	BookDAO book;

	@PostMapping(path = "/createBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse createBook(@RequestBody BookDetailsBean bean) {
		return book.createBook(bean);
	}

	@PutMapping(path = "/updateBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookDetailsBean bean) {
		return book.updateBook(bean);
	}

	@GetMapping(path = "/getBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getBook(@RequestParam int id, HttpServletRequest request) {
		return book.getBook(id, request);

	}

	@GetMapping(path = "/searchBook", produces = { MediaType.APPLICATION_JSON_VALUE })
	public LibraryResponse Book(@RequestParam String name, HttpServletRequest request) {
		return book.searchBook(name, request);
	}

	@GetMapping(path = "/getAllBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllBook(HttpServletRequest request) {
		return book.getAllBook(request);
	}

	@DeleteMapping(path = "/deleteBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@RequestParam int id, HttpServletRequest request) {
		return book.deleteBook(id, request);
	}

}
