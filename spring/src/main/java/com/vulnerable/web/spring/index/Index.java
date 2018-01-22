package com.vulnerable.web.spring.index;

public class Index {
	private String vuln;
	private String soln;

	public Index(String v, String s) {
		super();
		this.vuln = v;
		this.soln = s;
	}

	public String getVuln() {
		return vuln;
	}

	public void setVuln(String vuln) {
		this.vuln = vuln;
	}

	public String getSoln() {
		return soln;
	}

	public void setSoln(String soln) {
		this.soln = soln;
	}
	
	
}
