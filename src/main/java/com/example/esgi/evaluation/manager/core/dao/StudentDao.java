package com.example.esgi.evaluation.manager.core.dao;

import java.util.List;

import com.example.esgi.evaluation.manager.core.model.Student;

public interface StudentDao {

	List<Student> listStudents();
	
	Student createStudent(Student student);
	
	void updateStudent(long id);
	
	void deleteStudent(long id);
	
	Student findStudentById(long id);
}
