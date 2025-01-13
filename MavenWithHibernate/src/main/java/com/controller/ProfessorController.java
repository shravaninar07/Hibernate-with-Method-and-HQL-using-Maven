package com.controller;

import com.service.ProfessorService;

public class ProfessorController {

	public static void main(String[] args) {
		ProfessorService ser = new ProfessorService();
		// ser.Insert();
		// ser.Update();
		// ser.delete();
		ser.fetchAll();

	}
}
