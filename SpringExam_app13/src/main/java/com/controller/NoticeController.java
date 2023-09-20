package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.NoticeDTO;
import com.dto.PageDTO;
import com.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	NoticeService service;
	
	//목록보기
	@GetMapping("/list")
	public String list(@RequestParam (value="curPage",defaultValue = "1") String curPage ,Model m) {
		PageDTO pageDTO = service.list(Integer.parseInt(curPage));
		m.addAttribute("pageDTO", pageDTO);
		return "list";
	}
	
	//글쓰기 화면
	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}

	//글쓰기
	@PostMapping("/write")
	public String write(NoticeDTO dto) {
		int n = service.write(dto);
		return "redirect:list";
	}
	
	//글 자세히 보기
	@GetMapping("/retrieve")
	public String retrieve(@RequestParam int no, Model m) {
		NoticeDTO notice = service.retrieve(no);
		m.addAttribute("notice", notice);
		return "retrieve";
	}
	
	//글 수정
	@PostMapping("/update")
	public String update(NoticeDTO dto) {
		int n = service.update(dto);
		return "redirect:list";
	}
	
	//글 삭제
	@GetMapping("/delete")
	public String delete(@RequestParam int no) {
		int n = service.delete(no);
		return "redirect:list";
	}
	
}
