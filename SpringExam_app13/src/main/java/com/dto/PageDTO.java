package com.dto;

import java.util.List;

public class PageDTO {

	List<NoticeDTO> list;
	int perPage = 3; 
	int curPage; 
	int totalCount;

	public List<NoticeDTO> getList() {
		return list;
	}

	public void setList(List<NoticeDTO> list) {
		this.list = list;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	} 
	
	
}
