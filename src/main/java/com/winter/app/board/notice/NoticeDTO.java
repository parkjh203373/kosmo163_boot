package com.winter.app.board.notice;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoticeDTO {
	private Long noticeNum;
	private String noticeTitle;
	private String noticeContents;
	private String noticeWriter;
	private LocalDateTime createdAt;
	private Long viewCount;

}
