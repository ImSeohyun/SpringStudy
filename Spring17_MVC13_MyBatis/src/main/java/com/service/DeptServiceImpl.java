package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service("service")
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDAO dao;
	
	//목록보기
	@Override
	public List<DeptDTO> findAll() {
		return dao.findAll();
	}
	//부서등록
	// 만약에 transaction으로 처리하고자 하면
	//@Transactional 
	@Override
	public int deptAdd(DeptDTO dto) {
		return dao.deptAdd(dto);
	}
}
