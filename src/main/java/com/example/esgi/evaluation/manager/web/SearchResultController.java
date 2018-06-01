package com.example.esgi.evaluation.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchResultController {

	@GetMapping(path="/research")
	public String defaultHandler(ModelMap model) {
		return "searchResult";
	}
	
}
