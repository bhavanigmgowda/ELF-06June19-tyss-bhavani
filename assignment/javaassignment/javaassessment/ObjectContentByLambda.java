package com.tyss.javaassessment;
/*15)	WAP to display the content of object using lambda expression*/
import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class ObjectContentByLambda {
	static Consumer<Student> s=(st)->{
		log.info("Role number "+st.roleNumber);
		log.info("Name: "+st.name);
		log.info("Percentage : "+st.percentage);
		log.info("Gender : "+st.gender);
	};
	public static void main(String[] args) {
		Student student=new Student(6, "Jaya", 80.50, "female");
		s.accept(student);
	}

}
