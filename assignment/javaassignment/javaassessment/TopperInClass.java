package com.tyss.javaassessment;
/*6)	WAP to find the female and male topper of the class. (Using Lambda and Stream)*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TopperInClass {
	static Comparator<Student> c= (student1,student2)->{
		if(student1.getPercentage() > student2.getPercentage()) {
			return 1;
		}else if(student1.getPercentage() < student2.getPercentage()) {
			return -1;
		}else {
			return 0;
		}
	};
	
	public static void main(String[] args) {
		ArrayList<Student> arrayList=new ArrayList<>();
		arrayList.add( new Student(2, "John", 30.00,"male"));
		arrayList.add(new Student(9, "Abhay", 75.50,"male"));
		arrayList.add(new Student(1, "Ria", 60.00,"female"));
		arrayList.add(new Student(7, "Yogesh", 87.00,"male"));
		arrayList.add(new Student(5, "Leena", 48.00,"Female"));
		
		List<Student> list=arrayList.stream().sorted(c).collect(Collectors.toList());
		list.stream().forEach(stu->log.info(""+stu));
		
		Student st1=arrayList.stream().max(c).get();
		log.info("Topper Student: "+st1);
		log.info("Topper Student: "+list.get(list.size()-1));
		
		Student st2=arrayList.stream().min(c).get();
		log.info("Least Percentage student: "+st2);
		log.info("Least Percentage student: "+list.get(0));
		
		List<Student> femaleStudentList=arrayList.stream().sorted(c).filter(s ->s.gender.equalsIgnoreCase("female")).collect(Collectors.toList());
		log.info(" Female Topper  :"+arrayList.stream().sorted(c).filter(s ->s.gender.equalsIgnoreCase("female")).max(c).get());
		Student femaleTopper=femaleStudentList.stream().max(c).get();
		List<Student> maleStudentList=arrayList.stream().sorted(c).filter(s ->s.gender.equalsIgnoreCase("male")).collect(Collectors.toList());
		Student maleTopper=maleStudentList.stream().max(c).get();
		
		log.info("Female Topper : "+femaleTopper);
		log.info("Male Topper : "+maleTopper);
	}
}
