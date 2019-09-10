package com.tyss.lms.dao;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.lms.dto.LibraryResponse;
import com.tyss.lms.dto.UserRegisterBean;
import com.tyss.lms.repository.UserRepository;
@Service
public class UserDAOImpl implements UserDAO {
	@Autowired
	UserRepository repository;
	@Autowired
	LibraryResponse response;
	@Override
	public LibraryResponse createUser(@RequestBody UserRegisterBean bean) {
		if (!repository.existsById(bean.getUserId())) {

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
	public LibraryResponse updateUser(@RequestBody UserRegisterBean bean) {

		if (repository.existsById(bean.getUserId())) {
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
	public LibraryResponse getUser(@RequestParam int id, HttpServletRequest request) {
		//if (request.getSession(false) != null) {

			if (repository.existsById(id)) {
				UserRegisterBean bean = repository.findById(id).get();
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
	public LibraryResponse getSearch(@RequestParam String userName, HttpServletRequest request) {
		//if (request.getSession(false) != null) {
			List<UserRegisterBean> bean = repository.searchByName(userName);
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
	public LibraryResponse getAllUser(HttpServletRequest request) {
		// if(request.getSession(false)!=null) {
		List<UserRegisterBean> bean = (List<UserRegisterBean>) repository.findAll();
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
	}

	/*
	 * else { response.setStatusCode(501); response.setMessage("Failure");
	 * response.setDecription("Please login first"); return response; }
	 */
	@Override
	public LibraryResponse deleteUser(@RequestParam int id, HttpServletRequest request) {
		// if(request.getSession(false)!=null) {
		UserRegisterBean bean = repository.findById(id).get();
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
	}
	/*
	 * else { response.setStatusCode(501); response.setMessage("Failure");
	 * response.setDecription("Please login first"); return response; }
	 */

}
