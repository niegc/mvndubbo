package com.ngc.service;

import java.util.List;

import com.ngc.entity.Student;

public interface StudentService {
	
	
	public List<Student> getAllStudent();
	
	
	public Student getOneStudent(Long id);

}
