package jmp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jmp.spring.service.BoardService;
import jmp.spring.vo.BoardVo;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BoardController {

	@Autowired
	BoardService service;
	
	//1. ����������� �̵�
	@GetMapping("/board/register")
	public void insert() {
		
	}
	
	@PostMapping("/board/register")
	public String insertExe(BoardVo vo) {
		log.info(vo);
		int res = service.insertBoard(vo);
		
		return "redirect:/board/list";
	}
	
	
	@GetMapping("/board/list")
	public void getList(Model model) {
		
		
		model.addAttribute("list",service.getList());
		
		//log.info("getList()================");
	}
	
}