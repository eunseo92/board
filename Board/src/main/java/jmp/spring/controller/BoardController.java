package jmp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String insertExe(BoardVo vo, RedirectAttributes rttr) {
		log.info("==============" + vo);
		int res = service.insertBoard(vo);   //���� ó��
		
		rttr.addFlashAttribute("resMsg",vo.getBno()+"�� �Խñ��� ��� �Ǿ����ϴ�.");
		
		return "redirect:/board/list";   //�Խù� ������� list�� ����
	}
	
	
	@GetMapping("/board/list")
	public void getList(Model model) {
		
		
		model.addAttribute("list",service.getList());
		
		log.info("getList()================");
	}
	
	@GetMapping("/board/titleboard")
	public void Test1() {
		log.info("get Test1");
	}
	
	@GetMapping("/board/titleregister")
	public void  Test2() {
		log.info("get Test2");
	}
	
	public String insertExe1(BoardVo vo, RedirectAttributes rttr1) {
		log.info("==============" + vo);
		int res2 = service.insertBoard(vo);   //���� ó��
		rttr1.addFlashAttribute("resMsg",vo.getBno()+"�� �Խñ��� ��� �Ǿ����ϴ�.");
		return "redirect:/board/titleboard";
	}
	
	
	
}