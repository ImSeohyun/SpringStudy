package com.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService service;
	
	@GetMapping("/goodsRetrieve")//끝나고 이동할 페이지 /WEB-INF/views/goodsRetrieve.jsp
	//jsp에서 경로도 이 값으로 바꿔줘야 함
	
	@ModelAttribute("goodsRetrieve")//이 키값으로 GoodsDTO를 저장한다
	public GoodsDTO goodsRetrieve(@RequestParam String gCode, Model m) {
		
		GoodsDTO dto = service.goodsRetrieve(gCode);//모델
		return dto;
	}
	
	@Autowired
	CartService cService;
	
	@GetMapping("/CartAddServlet")
	public String cartAdd(CartDTO cartDTO, HttpSession session) {
		
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		//userid를 얻기 위해서 세션이 필요함. cartDTO에서 얻을 수 없음
		String userid = dto.getUserid();
		cartDTO.setUserid(userid);
		
		int n = cService.cartAdd(cartDTO);
		
		return "goods/cartAddSuccess";
	}

	@GetMapping("/CartListServlet")
	public ModelAndView cartList(HttpSession session) {
		
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		//userid를 얻기 위해서 세션이 필요함. cartDTO에서 얻을 수 없음
		String userid = dto.getUserid();
		
		List<CartDTO> list = cService.cartList(userid); //모델
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("cartList",list); //모델 저장
		mav.setViewName("cartList"); //뷰 저장
		return mav;
	}
	
	@GetMapping(value="/CartUpdateServlet",
			  produces = "text/plain;charset=utf-8")
	@ResponseBody //화면이 없다, 데이터만 넘겨줄 것이라고 알려주는 것(이 경우는 void라 넘겨주는 것도 없다)
	public void cartUpdate(@RequestParam HashMap<String, Integer> map) {
		//주문번호만 있으면 userid필요없이 동작할 수 있으므로 memberdto가 필요없다
		int n = cService.cartUpdate(map);
	}

	@GetMapping(value="/CartDeleteServlet")
	public String cartDelete(@RequestParam int num) {
		
		int n = cService.cartDelete(num);
		
		return "redirect:CartListServlet";
	}

	//이렇게 받아도 상관없다. 밑의 경우는 getParameterValues를 사용해보기 위한 예제
//	@GetMapping(value="/CartDeleteAllServlet")
//	public String cartDelAll(@RequestParam List<String> check) {
//		
//		int n = cService.cartDeleteAll(check);
//		
//		return "redirect:CartListServlet";
//	}
	
	@GetMapping(value="/CartDeleteAllServlet")
	public String cartDelAll(HttpServletRequest request) {
		
		String[] check = request.getParameterValues("check");
		List<String> del_list = Arrays.asList(check);
		int n = cService.cartDeleteAll(del_list);
		
		return "redirect:CartListServlet";
	}

	
}
