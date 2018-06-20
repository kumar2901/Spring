package com.bitwiseglobal.dao;


public class CustomerDAO 
{ 
	String name;
       public CustomerDAO() {
		// TODO Auto-generated constructor stub
    	   System.out.println("Inside Customer DAO");
	}
       public void setName(String name) {
		this.name = name;
	}
       public String getName() {
		return name;
	}
       @Override
       public String toString()
       {
    	   return "Hello,This is customerDAO";
       }
}
