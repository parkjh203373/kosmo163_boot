package com.winter.app.board.qna;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.qna.QnaDTO;
import com.winter.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Value("${app.upload.base}")
	private String filePath;
	
	@Value("${app.board.qna}")
	private String qna;
	
	public List<QnaDTO> list(Pager pager) throws Exception {
		pager.makePageNumber(qnaMapper.getCount(pager));
		
		return qnaMapper.list(pager);
		
	}
	
	public QnaDTO detail(QnaDTO qnaDTO) throws Exception {
		return qnaMapper.detail(qnaDTO);
	}
	
	public int create(QnaDTO qnaDTO, MultipartFile[] attach) throws Exception {
		int result = qnaMapper.create(qnaDTO);
		
		log.info(filePath);
		String filePath = this.filePath + "/" + this.qna;
		
		if(attach==null) {
			return result;
		}
		
		for(MultipartFile m:attach) {
			if(m.isEmpty()) {
				continue;
			}
			String fileName = UUID.randomUUID().toString();
			
			fileName = fileName+"_"+m.getOriginalFilename();
			
			File file = new File(filePath);
			
			if(!file.exists()) {
				file.mkdir();
			}
			
			file = new File(file, fileName);
			
			m.transferTo(file);
			
			QnaFileDTO qnaFileDTO = new QnaFileDTO();
			qnaFileDTO.setFileName(fileName);
			qnaFileDTO.setOriName(m.getOriginalFilename());
			qnaFileDTO.setNoticeNum(qnaDTO.getNoticeNum());
			result = qnaMapper.createFile(qnaFileDTO);
		}
		
		return result;
	}
	
	public int replyCreate(QnaDTO qnaDTO) throws Exception {
		QnaDTO parent = qnaMapper.detail(qnaDTO);
		
		qnaDTO.setNoticeRef(parent.getNoticeRef());
		qnaDTO.setNoticeStep(parent.getNoticeStep()+1);
		qnaDTO.setNoticeDepth(parent.getNoticeDepth()+1);
		
		int result = qnaMapper.replyUpdate(parent);
		
		qnaMapper.create(qnaDTO);
		
		return result;
	}

}
