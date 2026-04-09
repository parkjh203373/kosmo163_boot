package com.winter.app.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	
	public abstract List<NoticeDTO> list() throws Exception;
	
	public abstract NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int create(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int update(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int delete(NoticeDTO noticeDTO) throws Exception;

}
