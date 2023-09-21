package com.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {

	//servlet-context에서 구현 가능
	//<mvc:view-controller path="/LoginUIServlet" view-name="loginForm"/>로 대체
//	@GetMapping("/LoginUIServlet")
//	public String loginUI() {
//		return "loginForm";
//	}
	@Autowired
	MemberService service;
	
	@GetMapping("/LoginServlet")
	public String login(@RequestParam HashMap<String, String> map,
						HttpSession session) {
		
		MemberDTO dto = service.login(map);
		String nextPage = null;

		if(dto!=null) {
			session.setAttribute("login", dto);
			nextPage ="redirect:main";
		}else {
			nextPage="member/loginFail"; // /WEB-INF/views/member/loginFail.jsp
		}
		return nextPage;
	}
	
	@GetMapping("/LogoutServlet")
	public String logout(HttpSession session) {

		//인터셉터를 통해 로그인된 상태만 들어올 수 있음
			session.invalidate();
		
		return "redirect:main";
	}

}
