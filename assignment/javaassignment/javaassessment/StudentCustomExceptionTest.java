package com.tyss.javaassessment;
/*20)	WAP to create a custom exception to validate student eligibility for the exam.*/
public class StudentCustomExceptionTest{
	public static void main(String[] args)  {
		double attendencePer=60;
		StudentCustomException customException=new StudentCustomException();
		customException.validateExamCriteria(attendencePer);
	}
}
