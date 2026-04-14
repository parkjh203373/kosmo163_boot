package com.winter.app.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.QnaMapper;
import com.winter.app.board.notice.NoticeMapper;
import com.winter.app.page.Pager;

@SpringBootTest
class QnaMapperTest {

	@Autowired
	private QnaMapper qnaMapper;
	
//	@Test
//	void testCreate() throws Exception {
//		int idx=1;
//		for(int i=0; i<70; i++) {
//			QnaDTO qnaDTO = new QnaDTO();
//			qnaDTO.setNoticeTitle("title"+i);
//			qnaDTO.setNoticeContents("contents"+i);
//			qnaDTO.setNoticeWriter("C"+idx);
//			int result = qnaMapper.create(qnaDTO);
//			idx++;
//			if(idx>9) {
//				idx=1;
//			}
//			
//			if(i%10==0) {
//				Thread.sleep(1000);
//			}
//		
//		}
//		
//		System.out.println("finish");
//	}

}
