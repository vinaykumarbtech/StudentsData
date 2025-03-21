package com.mru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.entity.Students;
import com.mru.services.studentsServices;

@RestController
@CrossOrigin("*")

public class studentcontroller {
	@Autowired
	private studentsServices service;
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		return service.getAllStudents();
		
	}
	

}