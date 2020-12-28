package com.h2database.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2database.models.Student;
import com.h2database.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService  {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {	
		List<Student> students = new ArrayList<Student>();  
		studentRepository.findAll().forEach(student -> students.add(student));  
		return students;
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void delete(int id) {
		studentRepository.deleteById(id);
	}

}
