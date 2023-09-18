package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.DeptDTO;
import com.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	DeptService service;
	//목록보기
	@GetMapping("/findAll")
	public String findAll(Model m) {
		//모델
		List<DeptDTO> list = service.findAll();
		m.addAttribute("list", list);
		//뷰
		return "list";  // /WEB-INF/views/list.jsp
	}
	
	//부서등록 화면
	@GetMapping("/deptAddForm")
	public String deptAddForm() {
		return "write"; // /WEB-INF/views/write.jsp
	}
	
	//부서등록
	@PostMapping("/deptAdd")
	public String deptAdd(DeptDTO dto) {
		// DeptDTO --> DAO까지 전달
		int n = service.deptAdd(dto);
		return "redirect:findAll";
	}
	
}
