package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//http://localhost:8090/app/xxx
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home 메서드");
		
		return "/WEB-INF/views/hello.jsp";
	}
	
	//http://localhost:8090/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		
		return "/WEB-INF/views/hello.jsp";
	}
}
