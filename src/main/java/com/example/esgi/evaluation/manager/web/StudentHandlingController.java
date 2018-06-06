package com.example.esgi.evaluation.manager.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.esgi.evaluation.manager.core.StudentRepository;
import com.example.esgi.evaluation.manager.core.Utils;
import com.example.esgi.evaluation.manager.core.model.Student;

@Controller
public class StudentHandlingController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private Utils utils;
	
	@RequestMapping(path="/student-handling")
	public String defaultHandler(ModelMap model) {
		model.put("student", studentRepository.findAll());
		
		return "studentHandling";
	}
	
	@PostMapping(path="/student-handling/create-student")
	public String createStudent(String firstname, String lastname, String birthday) {
		Student s = new Student(firstname, lastname, utils.parseDate(birthday));
		studentRepository.save(s);

		return "redirect:/student-handling";
	}
	
	@PostMapping(path="/student-handling/update-student")
	public void updateStudent(Long id, String firstname, String lastname, String birthday) {
		Optional<Student> result = studentRepository.findById(id);
		if(result.isPresent()) {
			Student s = result.get();
			s.setFirstname(firstname);
			s.setLastname(lastname);
			s.setBirthday(utils.parseDate(birthday));
			studentRepository.save(s);
		}
	}
}
