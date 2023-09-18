package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("dao")
public class DeptDAO {

	@Autowired
	SqlSessionTemplate session;
	
	//목록보기
	public List<DeptDTO> findAll(){
		return session.selectList("DeptMapper.findAll");
	}
	
	//부서등록
	public int deptAdd(DeptDTO dto) {
		int n = session.insert("DeptMapper.deptAdd", dto);
		return n;
	}
}
