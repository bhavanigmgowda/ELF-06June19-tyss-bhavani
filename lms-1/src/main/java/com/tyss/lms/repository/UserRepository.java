package com.tyss.lms.repository;




import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tyss.lms.dto.UserRegisterBean;


public interface UserRepository extends CrudRepository<UserRegisterBean,Integer> {

	@Query("select u from UserRegisterBean u where u.email=:email" )
	public UserRegisterBean searchByEmail(@Param("email") String email);
	@Query(value ="select * from user_register e where e.user_id in(select e.user_id from user_register e where e.user_id like  %:user_id%)",nativeQuery = true)
	public List<UserRegisterBean> searchById(@Param("user_id") int user_id);
}
