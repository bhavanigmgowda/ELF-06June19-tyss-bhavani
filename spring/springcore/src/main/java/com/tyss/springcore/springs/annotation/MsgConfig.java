package com.tyss.springcore.springs.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.bean.MessageBean;

import lombok.extern.java.Log;

@Log
@Configuration
public class MsgConfig {
	@Scope("prototype")
	@Bean
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("hello");
		return messageBean;
	}

	@PostConstruct
	public void init() {
		log.info("initialization");
	}

	@PreDestroy
	public void destroy() {
		log.info("destroy");
	}

}
