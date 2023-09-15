package com.controller;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class LoginController {

	@GetMapping("/loginForm")
	public String home() {
		return "loginForm"; // /WEB-INF/views/loginForm.jsp로 포워드 요청됨
	}
	
	@GetMapping("/login")
	public String login(LoginDTO dto) {
		//사용자 입력 데이터 얻기
		System.out.println(dto);
		
		return "loginForm";
	}

	@GetMapping("/login2")
	public String login2(HttpServletRequest request) {
		//사용자 입력 데이터 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		String[] phone = request.getParameterValues("phone");
		String[] email = request.getParameterValues("email");
		
		System.out.println(userid+"  "+passwd );
		System.out.println(Arrays.toString(phone)+" "+ Arrays.toString(email));
		
		return "loginForm";
	}

	
}
