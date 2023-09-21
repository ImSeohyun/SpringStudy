package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrderDAO;
import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDAO dao;

	@Override
	public CartDTO cartByNum(int num) {
		return dao.cartByNum(num);
	}

	@Override
	public MemberDTO memberByUserid(String userid) {
		return dao.memberByUserid(userid);
	}

	@Override
	@Transactional //두 메서드 모두 성공 시 자동 커밋, 하나라도 런타임예외 발생 시 모두 롤백
	public int orderDone(OrderDTO dto, int del_num) {
		// 트랜잭션 시작
		int n = dao.orderDone(dto);

		// cart에서 삭제
		n = dao.cartDel(del_num);

		return n;
	}

}
