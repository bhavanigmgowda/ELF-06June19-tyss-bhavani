package com.tyss.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.warehouse.ItemBean;
import com.tyss.warehouse.ItemConfig;

import lombok.extern.java.Log;
@Log
public class PrintData {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
	SessionFactory factory=context.getBean(SessionFactory.class);
	Session session=factory.openSession();
	
	
	
	ItemBean bean=session.get(ItemBean.class, 123);
	log.info(""+bean.getCapacity());
	log.info(""+bean.getCost());
	log.info(""+bean.getDescription());
	log.info(""+bean.getItemID());
	log.info(""+bean.getItemName());




}
	
	
}
