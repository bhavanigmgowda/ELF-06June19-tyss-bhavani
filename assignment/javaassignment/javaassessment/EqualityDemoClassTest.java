package com.tyss.javaassessment;
/*25)	WAP to compare the equality of two objects.*/
import lombok.extern.java.Log;

@Log
public class EqualityDemoClassTest {
	public static void main(String[] args) {
		EqualityDemoClass e1=new EqualityDemoClass("aa", 1);
		EqualityDemoClass e2=new EqualityDemoClass("aa", 1);
		
		if(e1.hashCode() ==e2.hashCode()) {
			if(e1.equals(e2)) {
				log.info("Objects are equal");
			}else {
				log.info("Objects are not equal");
			}
		}
	}
}
