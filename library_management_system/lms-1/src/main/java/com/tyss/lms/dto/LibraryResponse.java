package com.tyss.lms.dto;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonRootName;
@Service
@JsonRootName("library_response")
public class LibraryResponse {
	private int statusCode;
	private String message;
	private List<Object> beans;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	public List<Object> getBeans() {
		return beans;
	}
	public void setBeans(List<Object> beans) {
		this.beans = beans;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	private String decription;
	
}
