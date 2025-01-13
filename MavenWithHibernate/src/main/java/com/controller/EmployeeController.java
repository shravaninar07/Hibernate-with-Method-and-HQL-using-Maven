package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) 
	{
		EmployeeService ser= new EmployeeService();
		//ser.insert();
		//ser.update();
	    //ser.delete();
		ser.fetchAll();
	
	}
}
