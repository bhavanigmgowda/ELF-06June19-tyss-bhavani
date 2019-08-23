package com.tyss.springcore.bean;

import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.convert.Property;

import lombok.Data;

@Data
public class CourseBean {
	private int courseID;
	private String courseName;
	private String faculty;
}
