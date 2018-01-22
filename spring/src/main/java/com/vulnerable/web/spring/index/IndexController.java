package com.vulnerable.web.spring.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@Autowired
	IndexService service;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String listURLs(ModelMap model) {
		model.addAttribute("indexes", service.getURLs());
		return "index";
	}
	
}
