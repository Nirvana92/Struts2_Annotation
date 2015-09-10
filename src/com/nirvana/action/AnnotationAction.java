package com.nirvana.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class AnnotationAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger("AnnotationAction");

	@Action(value = "/input", results = { @Result(name = "success", location = "/WEB-INF/views/success.jsp") })
	public String input() throws Exception {
		// logger.info("In input method of class Register");
		System.out.println("input method...");
		return SUCCESS;
	}
}
