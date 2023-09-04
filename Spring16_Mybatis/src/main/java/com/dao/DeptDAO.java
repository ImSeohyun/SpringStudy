package com.dao;

import java.util.Arrays;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

//@Component("dao")
@Repository("dao")
public class DeptDAO {

	@Autowired
	SqlSessionTemplate session;

	public List<DeptDTO> findAll(){
		return session.selectList("DeptMapper.findAll");
	}

}
