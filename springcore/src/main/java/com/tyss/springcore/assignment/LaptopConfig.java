package com.tyss.springcore.assignment;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfig {

	@Bean
	public Laptop getLaptop() {
		Laptop laptop=new Dell();
		return laptop;
	}
	@Bean
	public StorageDevice getStorageDevice() {
	return new HardDisk();                                                                                                                                              
	}
	
	
}
