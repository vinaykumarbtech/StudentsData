package com.mru.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.Repo.studentsRepo;
import com.mru.entity.Students;

@Service

public class studentsServices {
	@Autowired
	private studentsRepo repo;
	public List<Students> getAllStudents(){
		return repo.findAll();
	
}
}
