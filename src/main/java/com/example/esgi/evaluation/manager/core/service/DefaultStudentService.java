package com.example.esgi.evaluation.manager.core.service;

import java.util.List;

import javax.annotation.Resource;

import com.example.esgi.evaluation.manager.core.dao.StudentDao;
import com.example.esgi.evaluation.manager.core.model.Student;

public class DefaultStudentService implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	@Override
	public List<Student> listStudents() {
		return studentDao.listStudents();
	}

	@Override
	public Student createStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findStudentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
