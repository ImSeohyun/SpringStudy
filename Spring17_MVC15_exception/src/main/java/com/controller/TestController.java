package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//http://localhost:8090/app/xxx
	@RequestMapping("/xxx")
	public String home() {
		System.out.println("TestController.home 메서드");
		
		//명시적으로 예외 바생
		if(true) throw new ArithmeticException("에러발생");
		
		return "hello";
	}
	
	//http://localhost:8090/app/yyy
	@RequestMapping(value="/yyy")
	public String main() {
		System.out.println("TestController.main 메서드");
		
		return "hello";
	}
	
	@ExceptionHandler({ArithmeticException.class, NullPointerException.class}) //arithmeticexception을 처리한다~
	public String errorPage() {
		return "error"; 
	}
}
