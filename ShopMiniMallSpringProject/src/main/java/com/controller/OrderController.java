package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;

	@GetMapping(value="/OrderConfirmServlet")
	public String orderConfirm(@RequestParam int num, HttpSession session, Model m) {
		
		CartDTO cDTO = service.cartByNum(num);

		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		MemberDTO mDTO = service.memberByUserid(userid);
		
		//모델 저장
		m.addAttribute("cDTO",cDTO);
		m.addAttribute("mDTO",mDTO);
		
		return "orderConfirm";
	}

	@GetMapping(value="/OrderDoneServlet")
	public String orderDone(OrderDTO dto, @RequestParam int num,
							HttpSession session, Model m) {
		
		//가져온 dto에는 userid가 빠져있으므로 따로 가져와서 넣어준다
		MemberDTO mdto = (MemberDTO) session.getAttribute("login");
		String userid = mdto.getUserid();
		dto.setUserid(userid);
		int n = service.orderDone(dto, num);
		
		m.addAttribute("orderDTO",dto); //모델 저장
		return "orderDone"; //뷰 지정
	}
}
