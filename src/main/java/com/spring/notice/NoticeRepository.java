package com.spring.notice;

import java.util.Map;


public interface NoticeRepository {

	void setNewNotice(Notice notice);	//등록
	
	Notice getNoticeById(String nid);	//소개글 보기
	
	void checkNotice(Map map);	//조회수
}
