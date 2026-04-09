package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	public List<NoticeDTO> list() throws Exception {
		List<NoticeDTO> ar = noticeMapper.list();
		
		return ar;
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.detail(noticeDTO);
	}
	
	public int create(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.create(noticeDTO);
	}
	

}
