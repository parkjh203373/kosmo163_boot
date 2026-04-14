package com.winter.app.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.board.notice.NoticeDTO;
import com.winter.app.board.qna.QnaDTO;
import com.winter.app.page.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
	public String list(Pager pager, Model model) throws Exception {
		List<QnaDTO> ar = qnaService.list(pager);
		
		model.addAttribute("pager", pager);
		model.addAttribute("list", ar);
		
		return "qna/list";
	}
	
	@PostMapping("create")
	public String create(QnaDTO qnaDTO) throws Exception {
		int result = qnaService.create(qnaDTO);
		
		return "redirect:./list";
		
	}

}
