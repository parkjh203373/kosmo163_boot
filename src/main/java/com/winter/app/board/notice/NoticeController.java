package com.winter.app.board.notice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.page.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("list")
	public String list(Pager pager, Model model) throws Exception {
		//map (ar : 목록, 
		List<NoticeDTO> ar = noticeService.list(pager);
		
		model.addAttribute("pager", pager);
		model.addAttribute("list", ar);
		
		return "notice/list";
		
	}
	
	@GetMapping("detail")
	public String detail(NoticeDTO noticeDTO, Model model) throws Exception {
		noticeDTO = noticeService.detail(noticeDTO);
		
		model.addAttribute("d", noticeDTO);
		
		return "notice/detail";
	}
	
	@GetMapping("create")
	public String create() throws Exception {
		return "notice/create";
	}
	
	@PostMapping("create")
	public String create(NoticeDTO noticeDTO, @RequestParam("attach") MultipartFile attach) throws Exception {
		int result = noticeService.create(noticeDTO, attach);
		
		return "redirect:./list";
		
	}

}
