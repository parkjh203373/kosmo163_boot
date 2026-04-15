package com.winter.app.board.qna;

import java.util.List;

import com.winter.app.board.BoardDTO;
import com.winter.app.board.qna.QnaFileDTO;

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
	private List<QnaFileDTO> list;

}
