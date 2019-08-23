package com.tyss.springcore.springs.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.bean.MessageBean;

import lombok.extern.java.Log;

@Log
public class MsgConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MsgConfig.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
 
		MessageBean bean1 = context.getBean(MessageBean.class);
		MessageBean bean2 = context.getBean(MessageBean.class);
		
		log.info(bean1.getMessage());
		log.info(bean2.getMessage());
		
		bean2.setMessage("hello spring");
		log.info(bean1.getMessage());
		log.info(bean2.getMessage());
		
	}
}
