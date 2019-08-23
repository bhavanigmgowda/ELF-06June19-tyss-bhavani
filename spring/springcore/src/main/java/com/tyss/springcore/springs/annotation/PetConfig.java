package com.tyss.springcore.springs.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.bean.Animal;
import com.tyss.springcore.bean.Donkey;
import com.tyss.springcore.bean.Monkey;
import com.tyss.springcore.bean.Pet;

@Configuration
public class PetConfig {
	@Bean
	public Pet getPet() {
		return new Pet();
	}
	
	@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();
	}
	@Bean(name="donkey")
	public Animal getDonkey() {
		return new Donkey();
	}
	
}
