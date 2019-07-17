package com.tyss.springcore.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		//ApplicationContext context=new AnnotationConfigApplicationContext(PetConfig.class);
		//Pet pet=context.getBean(Pet.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("animal.xml");
		Pet pet=(Pet)context.getBean("pet");
		
		pet.getInfo();
	
	}
}
