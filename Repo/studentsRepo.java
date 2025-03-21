package com.mru.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.entity.students;
import com.mru.repo.studentsRepo;


@Service

public class studentsServices {
	@Autowired
	private studentsRepo repo;
	public List<students> getAllStudents(){
		return repo.findAll();
	
}
}