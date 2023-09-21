package com.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartDAO;
import com.dto.CartDTO;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDAO dao;

	@Override
	public int cartAdd(CartDTO dto) {
		return dao.cartAdd(dto);
	}

	@Override
	public List<CartDTO> cartList(String userid) {
		return dao.cartList( userid);
	}

	@Override
	public int cartUpdate(HashMap<String, Integer> map) {
		return dao.cartUpdate( map);
	}

	@Override
	public int cartDelete(int num) {
		return dao.cartDelete( num);
	}

	@Override
	public int cartDeleteAll(List<String> num) {
		return dao.cartDeleteAll( num);
	}

}
