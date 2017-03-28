package com.ngc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngc.entity.Student;
import com.ngc.mapper.StudentMapper;
import com.ngc.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
 @Autowired	
 private StudentMapper  studentMapper;
	
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentMapper.selectAllStudent();
	}


	@Override
	public Student getOneStudent(Long id) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(id);
	}
	
	

}
