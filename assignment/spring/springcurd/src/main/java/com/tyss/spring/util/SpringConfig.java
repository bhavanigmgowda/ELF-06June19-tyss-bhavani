package com.tyss.spring.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class SpringConfig {
	@Bean
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}
}
