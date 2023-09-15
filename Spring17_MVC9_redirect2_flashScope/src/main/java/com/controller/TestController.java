package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {

	//이전 redirect 요청
	@RequestMapping("/aaa")
	public String aaa(Model m) {
		System.out.println("aaa 호출");
		m.addAttribute("userid","홍길동");
		return "redirect:xxx";
	}
	//flash scope redirect 요청
	@RequestMapping("/bbb")
	public String bbb(RedirectAttributes m) {
		System.out.println("bbb 호출");
		m.addFlashAttribute("userid","홍길동");
		return "redirect:xxx";
	}
	
	@RequestMapping("/xxx")
	public String main() {
		System.out.println("main 호출");
	
		return "main";
	}
	
}









