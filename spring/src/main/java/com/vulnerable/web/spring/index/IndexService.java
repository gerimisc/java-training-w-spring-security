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
		indexes.add(new Index("<a href=/file/upload>Unrestricted File Upload</a>", "<a href=/file/upload-soln>Whitelisting of Content Type</a><br/>"
				+ "String org.springframework.web.multipart.MultipartFile.getContentType()<br/>"
				+ "<a>Whitelisting of file extensions</a><br/>"
				+ "org.apache.commons.io.FilenameUtils"));
		indexes.add(new Index("<a href=/file/upload>Directory Traversal</a>", "<a href=/file/upload-soln>Strips '/' </a><br/>"
				+ "String org.springframework.web.multipart.MultipartFile.getOriginalFilename()"));
		indexes.add(new Index("<a href=/index>SQL Injection</a>", "<a href=/xss/reflected>Spring module.. </a>"));
	}
	
	public List<Index> getURLs() {
		return indexes;
	}
}
