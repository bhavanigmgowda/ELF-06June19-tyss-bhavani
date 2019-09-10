package com.tyss.lms.dao;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.repository.BookRepository;

@Service

public class BookDAOImpl implements BookDAO {
	@Autowired
	BookRepository repository;
	@Autowired
	LibraryResponse response;
	@Override
	public LibraryResponse createBook(BookDetailsBean bean) {
		if (!repository.existsById(bean.getBookNo())) {
			response.setStatusCode(201);
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

	@Override
	public LibraryResponse updateBook(BookDetailsBean bean) {

		if (bean != null)
			if (repository.existsById(bean.getBookNo())) {
				response.setStatusCode(201);
				repository.save(bean);
				response.setMessage("successfull");
				response.setDecription("User data updated successfully ");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not updated");
			}
		return response;
	}

	@Override
	public LibraryResponse getBook(int id, HttpServletRequest request) {

		//if (request.getSession(false) != null) {

			if (repository.existsById(id)) {
				BookDetailsBean bean = repository.findById(id).get();

				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User data found successfully ");
				response.setBeans(Arrays.asList(bean));
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not  found");
			}
			return response;
		/*} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}*/

	}

	@Override
	public LibraryResponse searchBook(String name, HttpServletRequest request) {
		//if (request.getSession(false) != null) {
			List<BookDetailsBean> bean = repository.searchByName(name);

			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User data selected successfully ");
				response.setBeans(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not  selected successfully ");
			}
			return response;
		/*} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}*/
	}

	@Override
	public LibraryResponse getAllBook(HttpServletRequest request) {

		//if (request.getSession(false) != null) {
			List<BookDetailsBean> bean = (List<BookDetailsBean>) repository.findAll();
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User data found successfully ");
				response.setBeans(Arrays.asList(bean));
				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not  found");
			}
			return response;
		/*} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}
*/
	}

	@Override
	public LibraryResponse deleteBook(int id, HttpServletRequest request) {

		//if (request.getSession(false) != null) {

			BookDetailsBean bean = repository.findById(id).get();
			if (bean != null) {
				repository.delete(bean);
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDecription("User data Deleted successfully ");

				return response;
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDecription("User data not Deleted found");
			}
			return response;
		/*} else {
			response.setStatusCode(501);
			response.setMessage("Failure");
			response.setDecription("Please login first");
			return response;
		}*/

	}

}
