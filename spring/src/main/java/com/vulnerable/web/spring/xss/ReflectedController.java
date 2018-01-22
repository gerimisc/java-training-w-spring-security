package com.vulnerable.web.spring.xss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReflectedController {

	@Autowired
	ReflectedService service;
	
	@RequestMapping(value = "/xss/reflected", method = RequestMethod.GET)
	public String reflectedXSS(ModelMap model, @RequestParam(value = "name", defaultValue = "Guest!", required=false) final String name) {
		model.put("reflected", name);
		return "reflected";
	}
}
