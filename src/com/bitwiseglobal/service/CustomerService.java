package com.bitwiseglobal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitwiseglobal.dao.CustomerDAO;

@Component
public class CustomerService
{ 
	     @Autowired
         CustomerDAO cust;
         
         public CustomerService()
         {
			// TODO Auto-generated constructor stub
        	 System.out.println("Inside CustomerService class constructor.");
         }
         @Override
         public String toString()
         {
        	 return "CustomerService[CustomerDAO="+cust+"]";
         }
         public void printName()
         {
        	 System.out.println("Auther Name: "+cust.getName());
         }
         
}
