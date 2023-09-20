package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value= {"/main"})
	public String main() { 
		return "main";
	}
	
	@PostMapping("/yyy")
	public String yyy(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		return "main";
	}
	
	@PostMapping("/zzz")
	public String zzz(@RequestBody ArrayList<LoginDTO> list) {
		System.out.println(list);
		return "main";
	}
	
	
	
	
}
