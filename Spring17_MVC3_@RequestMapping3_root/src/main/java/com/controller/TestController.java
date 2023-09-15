package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/member/add")
    public String add(){
    	System.out.println("TestController.add");
    	return "/WEB-INF/views/main.jsp";
    }

    @RequestMapping(value="/member/del")
    public String del(){
    	System.out.println("TestController.del");
    	return "/WEB-INF/views/main.jsp";
    }
	
}
