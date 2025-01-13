package com.service;

import com.dao.EmployeeDAO;

public class EmployeeService {
	public void insert() {
		EmployeeDAO dao = new EmployeeDAO();
		dao.insert();
	}

	public void update() {
		EmployeeDAO dao = new EmployeeDAO();
		dao.update();
	}

	public void delete() {
		EmployeeDAO dao = new EmployeeDAO();
		dao.delete();
	}
	
	public void fetchAll() {
		EmployeeDAO dao = new EmployeeDAO();
		dao.fetchAll();
	}
}
