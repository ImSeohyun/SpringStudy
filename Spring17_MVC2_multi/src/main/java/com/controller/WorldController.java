package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {
	
	//요청 URL: http://localhost:8090/app/yyy
	@RequestMapping(value = "/yyy")
	public String aaa() {
		System.out.println("worldcontroller aaa");
		//forward방식으로 전송
		return "/WEB-INF/views/aaa.jsp";
	}

}
