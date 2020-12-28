package com.h2database.service;

import java.util.List;

import com.h2database.models.Student;

public interface IStudentService {

	List<Student> getAllStudent();
	
	Student getStudentById(int id);
	
	void saveOrUpdate(Student student);
	
	void delete(int id);
	
}
