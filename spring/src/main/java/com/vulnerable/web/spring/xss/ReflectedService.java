package com.vulnerable.web.spring.xss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReflectedService {
	private static List<Reflected> reflecteds = new ArrayList<Reflected>();

	public void addReflected(String name) {
		reflecteds.add(new Reflected(name));
	}
}
