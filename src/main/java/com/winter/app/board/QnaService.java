package com.winter.app.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.board.qna.QnaDTO;
import com.winter.app.page.Pager;

@Service
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	public List<QnaDTO> list(Pager pager) throws Exception {
		pager.makePageNumber(qnaMapper.getCount(pager));
		
		return qnaMapper.list(pager);
		
	}
	
	public int create(QnaDTO qnaDTO) throws Exception {
		int result = qnaMapper.create(qnaDTO);
		
		return result;
	}

}
