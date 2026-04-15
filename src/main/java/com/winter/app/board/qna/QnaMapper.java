package com.winter.app.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.winter.app.board.qna.QnaDTO;
import com.winter.app.page.Pager;

@Mapper
public interface QnaMapper {
	
	public abstract int replyUpdate(QnaDTO qnaDTO) throws Exception;
	
	public abstract int createFile(QnaFileDTO qnaFileDTO) throws Exception;
	
	public abstract Long getCount(Pager pager) throws Exception;
	
	public abstract List<QnaDTO> list(Pager pager) throws Exception;
	
	public abstract QnaDTO detail(QnaDTO qnaDTO) throws Exception;
	
	public abstract int create(QnaDTO qnaDTO) throws Exception;
	
	public abstract int update(QnaDTO qnaDTO) throws Exception;
	
	public abstract int delete(QnaDTO qnaDTO) throws Exception;

}
