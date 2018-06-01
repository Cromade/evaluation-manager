package com.example.esgi.evaluation.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormerController {

	@RequestMapping(path="/former")
	public String defaultHandler(ModelMap model) {
		return "former";
	}
}
