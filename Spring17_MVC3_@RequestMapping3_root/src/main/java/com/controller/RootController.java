package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class RootController {

	@RequestMapping(value="/add")
    public String add(){
    	System.out.println("RootController.add");
    	return "/WEB-INF/views/main.jsp";
    }

    @RequestMapping(value="/del")
    public String del(){
    	System.out.println("RootController.del");
    	return "/WEB-INF/views/main.jsp";
    }
	
}
