package com.vulnerable.web.spring.xss;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/xss")
public class ReflectedController {

	@Autowired
	ReflectedService service;
	
	@RequestMapping(value = "/reflected", method = RequestMethod.GET)
	public String reflectedXSS(ModelMap model, @RequestParam(value = "name", defaultValue = "Guest!", required=false) final String name) {
		model.put("reflected", name);
		return "reflected";
	}
	
	@RequestMapping(value = "/reflected-2", method = RequestMethod.GET)
	public String reflectedXSS2(ModelMap model, @RequestParam(value = "name", defaultValue = "Guest!", required=false) final String name) {
		model.put("reflected", name);
		return "reflected-2";
	}
		
	@RequestMapping(value = "/reflected-2", method = RequestMethod.POST)
	public String reflectedXSS2Post(ModelMap model, @RequestParam String name) {
		model.put("reflected", name);
		return "reflected-2";
	}
	
	@RequestMapping(value = "/dom", method = RequestMethod.GET)
	public String domXSS() {;
		return "dom-xss";
	}
	
	// Solution: JSTL Core HTML Escaping
	@RequestMapping(value = "/reflected-soln", method = RequestMethod.GET)
	public String reflectedXSSSoln(ModelMap model, @RequestParam(value = "name", defaultValue = "Guest!", required=false) final String name) {
		model.put("reflected", name);
		return "reflected-soln";
	}
	
	// Solution: Spring tag library
	@RequestMapping(value = "/reflected-soln-2", method = RequestMethod.GET)
	public ModelAndView reflectedXSS2PostPage() {
		return new ModelAndView("reflected-soln-2", "reflected", new Reflected());
	}
	
	@RequestMapping(value = "/reflected-soln-2", method = RequestMethod.POST)
	public String reflectedXSS2PostSoln(ModelMap model, @Valid @ModelAttribute("reflected") Reflected reflected, BindingResult result) {
//		if (result.hasErrors()) {
//            return "error";
//        }
		model.addAttribute("name", reflected.getName());
		return "reflected-soln-2";
	}
}
