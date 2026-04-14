package com.winter.app.board.qna;

import com.winter.app.board.BoardDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO {
	
	private Long noticeRef;
	private Long noticeStep;
	private Long noticeDepth;

}
