package com.vulnerable.web.spring.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

	private static List<Index> indexes = new ArrayList<Index>();

	static {
		indexes.add(new Index("<a href=/xss/reflected>Reflected XSS (GET)</a>", "<a href=/xss/reflected-soln>JSTL Core Library </a>"));
		indexes.add(new Index("<a href=/xss/reflected-2>Reflected XSS (POST)</a>", "<a href=/xss/reflected-soln-2>Spring MVC Tags</a>"));
		indexes.add(new Index("<a href=/xss/stored>Stored XSS </a>", "<a href=/xss/reflected>Spring module.. </a>"));
		indexes.add(new Index("<a href=/xss/dom>DOM XSS </a>", "<a href=/xss/reflected>Spring module.. </a>"));
		indexes.add(new Index("<a href=/index>Unrestricted File Upload</a>", "<a href=/xss/reflected>Spring module.. </a>"));
		indexes.add(new Index("<a href=/index>Directory Traversal</a>", "<a href=/xss/reflected>Spring module.. </a>"));
		indexes.add(new Index("<a href=/index>SQL Injection</a>", "<a href=/xss/reflected>Spring module.. </a>"));
	}
	
	public List<Index> getURLs() {
		return indexes;
	}
}
