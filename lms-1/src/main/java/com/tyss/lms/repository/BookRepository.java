package com.tyss.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tyss.lms.dto.BookDetailsBean;
import com.tyss.lms.dto.UserRegisterBean;

public interface BookRepository extends CrudRepository<BookDetailsBean,Integer> {

	@Query("select u from UserRegisterBean u where u.email=:email" )
	public BookDetailsBean searchByEmail(@Param("email") String email);
	@Query(value ="select * from user_register e where e.book_name in(select e.book_name from user_register e where e.book_name like  %:book_name%)",nativeQuery = true)
	public List<BookDetailsBean> searchByName(@Param("book_name") String bookName);
}
