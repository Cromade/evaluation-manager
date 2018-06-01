package com.example.esgi.evaluation.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentHandlingController {
	
	@RequestMapping(path="/student-handling")
	public String defaultHandler(ModelMap model) {
		return "studentHandling";
	}
}
