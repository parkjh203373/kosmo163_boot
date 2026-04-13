package com.winter.app.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.winter.app.page.Pager;

@Mapper
public interface NoticeMapper {
	
	public abstract Long getCount(Pager pager) throws Exception;
	
	public abstract List<NoticeDTO> list(Pager pager) throws Exception;
	
	public abstract NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int create(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int update(NoticeDTO noticeDTO) throws Exception;
	
	public abstract int delete(NoticeDTO noticeDTO) throws Exception;

}
