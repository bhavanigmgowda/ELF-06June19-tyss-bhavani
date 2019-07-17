package com.tyss.springcore.springs;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.bean.MessageBean;

public class MesgTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");

		System.out.println(messageBean.getMessage());
	}
}
