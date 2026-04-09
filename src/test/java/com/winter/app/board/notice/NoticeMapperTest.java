package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoticeMapperTest {
	
	@Autowired
	private NoticeMapper noticeMapper;

	//@Test
	void testList() throws Exception {
		List<NoticeDTO> ar = noticeMapper.list();
		
		assertNotEquals(0, ar);
	}
	
	//@Test
	void testDetail() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeNum(1L);
		noticeDTO = noticeMapper.detail(noticeDTO);
		
		assertNotNull(noticeDTO);
		
	}
	
	//@Test
	void testCreate() throws Exception {
		int idx=1;
		for(int i=0; i<110; i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNoticeTitle("title"+i);
			noticeDTO.setNoticeContents("contents"+i);
			noticeDTO.setNoticeWriter("P00"+idx);
			int result = noticeMapper.create(noticeDTO);
			idx++;
			if(idx>9) {
				idx=1;
			}
			
			if(i%10==0) {
				Thread.sleep(1000);
			}
		
		}
		
		System.out.println("finish");
	}
	
	//@Test
	void testUpdate() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeTitle("Title");
		noticeDTO.setNoticeContents("Contents");
		noticeDTO.setNoticeWriter("P002");
		noticeDTO.setViewCount(0L);
		noticeDTO.setNoticeNum(2L);
		int result = noticeMapper.update(noticeDTO);
		
		assertEquals(1, result);
		
	}
	
	//@Test
	void testDelete() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeNum(2L);
		int result = noticeMapper.delete(noticeDTO);
		
		assertEquals(1, result);
		
	}
	
}
