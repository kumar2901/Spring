package com.bitwiseglobal.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitwiseglobal.service.CustomerService;

public class MainApp {

	private static ApplicationContext context;

	public static void main(String[] args) {
	   context = new ClassPathXmlApplicationContext("customer.xml");
       CustomerService cust=(CustomerService)context.getBean(CustomerService.class);
       System.out.println(cust);
       cust.printName();
	}

}
