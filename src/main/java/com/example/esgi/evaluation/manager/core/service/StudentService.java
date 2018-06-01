package com.example.esgi.evaluation.manager.core.service;

import java.util.List;

import com.example.esgi.evaluation.manager.core.model.Student;

public interface StudentService {

	List<Student> listStudents();
	
	Student createStudent();
	
	void updateStudent(long id);
	
	void deleteStudent(long id);
	
	Student findStudentById(long id);
}
