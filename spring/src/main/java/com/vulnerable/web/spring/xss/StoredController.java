package com.vulnerable.web.spring.xss;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/xss")
public class StoredController {

	@Autowired
	StoredService service;
	
	@RequestMapping(value = "/stored", method = RequestMethod.GET)
	public String listPeople(ModelMap model) {
		model.addAttribute("people", service.retrievePeople());
		return "stored-xss";
	}
	
	@RequestMapping(value = "/stored/add", method = RequestMethod.GET)
	public String addPerson(ModelMap model) {
		model.addAttribute("people", service.retrievePeople());
		return "stored-xss-add";
	}
	
	@RequestMapping(value = "/stored/add", method = RequestMethod.POST)
	public String addPerson(ModelMap model, @RequestParam String name, @RequestParam String desc) {
		service.addPerson(name, desc);
		model.clear();
		return "redirect:/xss/stored";
	}
	
	@RequestMapping(value = "/stored/delete", method = RequestMethod.GET)
	public String delPerson(ModelMap model, @RequestParam int id) {
		service.deletePerson(id);
		model.clear();
		return "redirect:/xss/stored";
	}
}
