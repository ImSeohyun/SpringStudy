package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NoticeDAO;
import com.dto.NoticeDTO;
import com.dto.PageDTO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeDAO dao;
	
	//목록보기
	@Override
	public PageDTO list(int curPage) {
		return dao.list(curPage);
	}

	//글쓰기
	@Override
	public int write(NoticeDTO dto) {
		return dao.write(dto);
	}

	//글 자세히 보기
	@Override
	public NoticeDTO retrieve(int no) {
		//조회수 증가
		int n = dao.readcnt(no);
		return dao.retrieve(no);
	}

	//글 수정
	@Override
	public int update(NoticeDTO dto) {
		return dao.update(dto);
	}

	//글 삭제
	@Override
	public int delete(int no) {
		return dao.delete(no);
	}

}
