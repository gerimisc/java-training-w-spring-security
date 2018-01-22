package com.vulnerable.web.spring.xss;

import org.springframework.stereotype.Controller;

@Controller
public class Reflected {
	private String name;
	
	public Reflected(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
