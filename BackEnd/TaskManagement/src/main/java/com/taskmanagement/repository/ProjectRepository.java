package com.taskmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskmanagement.dto.ProjectBean;
import com.taskmanagement.dto.ProjectPKBean;

public interface ProjectRepository extends JpaRepository<ProjectBean,ProjectPKBean>{
	
	  @Query("select c from ProjectBean c where c.projectPkBean=:pkbean")
	  Optional<ProjectBean> findUserById( ProjectPKBean pkbean);
	  
	  @Query("select c from ProjectBean c where c.projectPkBean.groupId=:projectId")
	  List<ProjectBean> getAll( int projectId);
	  
	    @Query("select c from ProjectBean c where c.projectPkBean.groupId=:projectId")
		  List<ProjectBean> getAllMembers(int  projectId);
		  
		  @Query("select count(*) from ProjectBean c where c.projectPkBean.groupId=:projectId")
		  int findProjectById(int projectId);
		  
		  @Query("select count(*) from ProjectBean c where c.projectPkBean.userBean.email=:email")
		   int getProjectsByEmail(String email);

		@Query("select c from ProjectBean c where c.projectPkBean.userBean.email=:email")
		List<ProjectBean> getProjectsByEmaill(String email);

        @Query("select c from ProjectBean c where c.projectPkBean.groupId=:projectId and :projectId= (select c.projectPkBean.groupId from  ProjectBean c where c.projectPkBean.userBean.employeeName=:name)")
	List<ProjectBean> searchMember(String name, int projectId);

		@Query("select c from ProjectBean c where c.projectPkBean.userBean.email=:email and c.projectPkBean.groupId=:groupId ")
		  Optional<ProjectBean>  getProjectsByEmaill(String email,int groupId);
}
