package com.service;

import com.dao.ProfessorDAO;

public class ProfessorService {
	
	public void  Insert() {
		ProfessorDAO pro= new ProfessorDAO();
		pro.insert();
	}
	public void  Update() {
		ProfessorDAO pro= new ProfessorDAO();
		pro.update();
	}
	
	public void  delete() {
		ProfessorDAO pro= new ProfessorDAO();
		pro.delete();
	}

	public void  fetchAll() {
		ProfessorDAO pro= new ProfessorDAO();
		pro.fetchAll();
	}
}
