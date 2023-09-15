package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//요청 URL: http://localhost:8090/app/xxx
	@RequestMapping("/xxx")
	public String aaa() {
		System.out.println("hellocontroller aaa");
		//forward방식으로 전송
		return "/WEB-INF/views/aaa.jsp";
	}

}
