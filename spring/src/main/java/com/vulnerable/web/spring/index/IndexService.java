package com.vulnerable.web.spring.index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

	private static List<Index> indexes = new ArrayList<Index>();

	static {
		indexes.add(new Index("<a href=/xss/reflected>Reflected XSS </a>", "<a href=/xss/reflected>Spring module </a>"));
		indexes.add(new Index("<a href=/xss/stored>Stored XSS </a>", "<a href=/xss/reflected>Spring module.. </a>"));

		
	}
	
	public List<Index> getURLs() {
		return indexes;
	}
}
