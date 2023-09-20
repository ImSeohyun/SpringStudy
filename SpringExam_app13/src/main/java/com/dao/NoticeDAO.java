package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.NoticeDTO;
import com.dto.PageDTO;

@Repository("noticeDAO")
public class NoticeDAO {

	@Autowired
	SqlSessionTemplate session;

	//목록보기
	public PageDTO list(int curPage){
		PageDTO pageDTO = new PageDTO();
		int offset = (curPage - 1)*pageDTO.getPerPage();
		int limit = pageDTO.getPerPage();
		
		List<NoticeDTO> list = session.selectList("NoticeMapper.list", null,
				new RowBounds(offset,limit));
		
		pageDTO.setList(list);
		pageDTO.setCurPage(curPage);
		
		int totalCount = session.selectOne("NoticeMapper.totalCount");
		pageDTO.setTotalCount(totalCount);
		return pageDTO;
	}
	
	//글쓰기
	public int write(NoticeDTO dto) {
		return session.insert("NoticeMapper.write",dto);
	}
	
	//글 자세히 보기
	public NoticeDTO retrieve(int no){
		return session.selectOne("NoticeMapper.retrieve",no);
	}
	
	//조회수 증가
	public int readcnt (int no) {
		return session.update("NoticeMapper.readcnt", no);
	}
	
	//글 수정
	public int update (NoticeDTO dto) {
		return session.update("NoticeMapper.update", dto);
	}
	
	//글 삭제
	public int delete(int no) {
		return session.delete("NoticeMapper.delete", no);
	}
}
