package com.h2database.repository;

import org.springframework.data.repository.CrudRepository;

import com.h2database.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
